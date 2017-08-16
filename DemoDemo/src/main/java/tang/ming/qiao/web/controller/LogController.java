package tang.ming.qiao.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import tang.ming.qiao.domain.UserInfo;
import tang.ming.qiao.service.ILogService;
import tang.ming.qiao.service.impl.LogServiceImpl;
import tang.ming.qiao.utils.SendSMSUtil;
import tang.ming.qiao.utils.tools.Constant;
import tang.ming.qiao.utils.tools.DesUtil;
import tang.ming.qiao.utils.tools.MD5Utils;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author:tangmq
 * @Date:2017/7/18
 * @Note:
 */
@Controller
public class LogController extends BaseController {
    @Resource
    private ILogService logService;

    @RequestMapping(value = "/log", method = RequestMethod.GET)
    public ModelAndView log() {
        return new ModelAndView("log");
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void logging(@RequestParam("isRemenber") String isRemenber,@RequestParam("isAutoLog") String isAutoLog,@RequestParam("username") String username, @RequestParam("password") String password, HttpServletResponse response) {
        try {
            UserInfo userInfo = logService.checkAssign(username, password);
            if (userInfo!=null) {
                //登录用户放到cookie中
                Cookie cookie = new Cookie(Constant.USER_KEY,String.valueOf(userInfo.getId()));
                //将cookie 放入response
                response.addCookie(cookie);
                //跳转页面
                response.sendRedirect("/index.jsp");
            }else{
                response.sendRedirect("/pages/log.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/sendSMS", method = RequestMethod.POST)
    public ModelAndView sandSMS(@RequestParam("tel") String tel, @RequestParam(value = "code", required = false) String code) {
        return new ModelAndView("log");
    }

}
