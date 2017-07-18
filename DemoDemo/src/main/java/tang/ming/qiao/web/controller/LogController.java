package tang.ming.qiao.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import tang.ming.qiao.mapper.BaseMapper;

/**
 * @Author:tangmq
 * @Date:2017/7/18
 * @Note:
 */
@Controller
public class LogController extends BaseController {
    @RequestMapping(value = "/log", method = RequestMethod.GET)
    public ModelAndView log() {
        return new ModelAndView("log");
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView logging(@RequestParam("tel") String tel, @RequestParam("SMSCode") String SMSCode) {
        return new ModelAndView("log");
    }

    @RequestMapping(value = "/sendSMS", method = RequestMethod.POST)
    public ModelAndView sandSMS(@RequestParam("tel")String tel,@RequestParam(value = "code",required = false) String code){
        return new ModelAndView("log");
    }
}
