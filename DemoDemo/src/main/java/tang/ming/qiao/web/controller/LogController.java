package tang.ming.qiao.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import tang.ming.qiao.domain.UserInfo;
import tang.ming.qiao.service.ILogService;
import tang.ming.qiao.service.IUserInfoService;
import tang.ming.qiao.service.impl.LogServiceImpl;
import tang.ming.qiao.utils.SendSMSUtil;
import tang.ming.qiao.utils.tools.AjaxResult;
import tang.ming.qiao.utils.tools.Constant;
import tang.ming.qiao.utils.tools.DesUtil;
import tang.ming.qiao.utils.tools.MD5Utils;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

    @RequestMapping(value = "/sendSMS", method = RequestMethod.POST)
    public ModelAndView sandSMS(@RequestParam("tel") String tel, @RequestParam(value = "code", required = false) String code) {
        return new ModelAndView("log");
    }

    @RequestMapping(value = "/forgotPsd", method = RequestMethod.GET)
    public ModelAndView forgotPsd() {
        return new ModelAndView("forgotPsd");

    }
}
