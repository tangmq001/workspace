package tang.ming.qiao.web.controller;

import com.alibaba.druid.sql.visitor.functions.Lpad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import tang.ming.qiao.domain.UserInfo;
import tang.ming.qiao.service.ILogService;
import tang.ming.qiao.service.ISendSMSService;
import tang.ming.qiao.service.IUserInfoService;
import tang.ming.qiao.service.impl.LogServiceImpl;
import tang.ming.qiao.utils.SendSMSUtil;
import tang.ming.qiao.utils.tools.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * @Author:tangmq
 * @Date:2017/7/18
 * @Note:
 */
@Controller
public class LogController extends BaseController {
    @Resource
    private ILogService logService;
    @Resource
    private IUserInfoService userInfo;
    @Resource
    private ISendSMSService sendSMSService;
    //@Resource
    //private BizConfig bizConfig;

    @RequestMapping(value = "/log", method = RequestMethod.GET)
    public ModelAndView log(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("log");
        try {
            Cookie[] cookies = request.getCookies();
            for (Cookie c : cookies) {
                if (c.getName().equals(Constant.REMENBER_KEY)) {
                    UserInfo userInfo = this.userInfo.selectById(c.getValue());
                    mv.addObject("user1", userInfo);
                    mv.addObject("checked", "checked");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Map logging(@RequestParam(value = "isRemenber", required = false) String isRemenber, @RequestParam("username") String username, @RequestParam("password") String password,
                       HttpServletRequest request, HttpServletResponse response) {
        try {
            UserInfo userInfo = logService.checkAssign(username, MD5Utils.generate(password));
            if (userInfo != null) {
                //登录用户放到session中
                request.getSession().setAttribute(Constant.USER_KEY, String.valueOf(userInfo.getId()));
                //如果页面记住账号,则放入cookie中存储
                if (Boolean.parseBoolean(isRemenber)) {
                    Cookie cookie = new Cookie(Constant.REMENBER_KEY, String.valueOf(userInfo.getId()));
                    cookie.setMaxAge(15 * 24 * 60 * 60);//存放十五天
                    response.addCookie(cookie);
                } else {
                    Cookie cookie = new Cookie(Constant.REMENBER_KEY, "");
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                }
                return AjaxResult.success();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return AjaxResult.fail();
    }

    /**
     * 发送验证码
     *
     * @param tel
     * @param response
     * @return
     */
    @RequestMapping(value = "/sendSMS", method = RequestMethod.POST)
    @ResponseBody
    public Map sendSMS(@RequestParam("tel") String tel, HttpServletResponse response) {
        try {
            String sign = new String("丹秋在线".getBytes("ISO8859-1"), "utf-8");
            String s = sendSMSService.sendValCode(tel, sign, "SMS_69875374");
            if ("-1".equals(s)) {
                return AjaxResult.fail();
            } else {
                Cookie cookie = new Cookie("SMSCODE", s);
                response.addCookie(cookie);
                return AjaxResult.success();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return AjaxResult.fail();
        }
    }

    /**
     * 验证验证码
     *
     * @param
     * @param
     * @return
     */
    @RequestMapping(value = "/checkSMS", method = RequestMethod.POST)
    @ResponseBody
    public Map sendSMS(@RequestParam("code") String code, HttpServletRequest request) {
        try {
            Cookie[] cookies = request.getCookies();
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("SMSCODE")) {
                    if (code.equals(cookie.getValue())) {
                        return AjaxResult.success();
                    }
                }
            }
            return AjaxResult.fail();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.fail(e.getMessage());
        }
    }

    @RequestMapping(value = "/resetPsd", method = RequestMethod.POST)
    @ResponseBody
    public Map forgotPsd(@RequestParam("telephone") String telephone, @RequestParam("newPsd") String newPsd) {
        try {
            logService.changePsd(telephone, newPsd);
            return AjaxResult.success();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.fail();
        }
    }
    @RequestMapping(value = "/forgotPsd", method = RequestMethod.GET)
    public ModelAndView forgotPsd() {
        return new ModelAndView("forgotPsd");
    }
}
