package tang.ming.qiao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tang.ming.qiao.domain.UserInfo;
import tang.ming.qiao.domain.UserInfoExample;
import tang.ming.qiao.mapper.UserInfoMapper;
import tang.ming.qiao.service.IUserInfoService;

import java.util.List;

/**
 * @Author:tangmq
 * @Date:2017/7/14
 * @Note:
 */
@Service("userInfo")
public class UserInfoServiceImpl implements IUserInfoService {
    @Autowired
    private UserInfoMapper userMapper;
    public void delete(Long id) {
        userMapper.deleteByPrimaryKey(id);
    }

    public List<UserInfo> getAll() {
        UserInfoExample e = new UserInfoExample();
        return userMapper.selectByExample(e);
    }
}
