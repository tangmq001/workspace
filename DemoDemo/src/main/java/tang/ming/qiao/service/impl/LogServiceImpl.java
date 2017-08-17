package tang.ming.qiao.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import tang.ming.qiao.domain.UserInfo;
import tang.ming.qiao.domain.UserInfoExample;
import tang.ming.qiao.mapper.UserInfoMapper;
import tang.ming.qiao.service.ILogService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:tangmq
 * @Date:2017/7/19
 * @Note:
 */
@Service("logService")
public class LogServiceImpl implements ILogService {
    @Resource
    private UserInfoMapper userInfoMapper;
    @Override
    public UserInfo checkAssign(String username, String password) {
        UserInfoExample e=new UserInfoExample();
        UserInfoExample.Criteria c = e.createCriteria();
        if(StringUtils.isNotBlank(username)){
            c.andAccountEqualTo(username);
        }
        if(StringUtils.isNotBlank(username)){
            c.andPasswordEqualTo(password);
        }
        List<UserInfo> userInfos = userInfoMapper.selectByExample(e);
        for(UserInfo u:userInfos){
            return u;
        }
        return null;
    }
}
