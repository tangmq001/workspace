package tang.ming.qiao.web.controller;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import tang.ming.qiao.domain.User;
import tang.ming.qiao.service.IUserService;

import java.util.*;

/**
 * @Author:tangmq
 * @Date:2017/7/14
 * @Note:
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private IUserService userService;
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("")
    public ModelAndView index() {
        return new ModelAndView("user");
    }
    @Autowired
    private RedisTemplate<String, String> redis;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public Map getAll() {
        HashMap m = new HashMap();
        List<User> list = new ArrayList();
        try {
            Set<String> keys = redis.keys("USER*");
            if (keys == null || keys.isEmpty()) {
                list = userService.getAll();
                if(list.size()>0){
                    for(User user:list){
                        redis.opsForValue().set("USER"+user.getId(), JSON.toJSONString(user));
                    }
                }
            }else {
                Iterator<String> iterator = keys.iterator();
                while (iterator.hasNext()){
                    String key=iterator.next();
                    String obj = redis.opsForValue().get(key);
                    list.add(JSON.parseObject(obj,User.class));
                }
            }
            m.put("data", list);
            m.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            m.put("success", false);
        }
        return m;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public Map del(@PathVariable("id") int id) {
        HashMap m = new HashMap();
        try {
            userService.delete(id);
            m.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            m.put("success", false);
        }
        return m;
    }


}
