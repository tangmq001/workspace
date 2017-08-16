package tang.ming.qiao.service;


import tang.ming.qiao.domain.UserInfo;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:tangmq
 * @Date:2017/7/14
 * @Note:
 */
public interface IUserInfoService {
    void delete(Long id);

    List<UserInfo> getAll();

    UserInfo selectById(String value);
}
