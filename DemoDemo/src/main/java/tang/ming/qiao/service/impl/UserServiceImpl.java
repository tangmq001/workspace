package tang.ming.qiao.service.impl;

import com.fasterxml.jackson.databind.deser.Deserializers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import tang.ming.qiao.domain.User;
import tang.ming.qiao.domain.UserExample;
import tang.ming.qiao.mapper.UserMapper;
import tang.ming.qiao.service.IUserService;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * @Author:tangmq
 * @Date:2017/7/14
 * @Note:
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    public void delete(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }

    public List<User> getAll() {
        UserExample e = new UserExample();
        return userMapper.selectByExample(e);
    }
}
