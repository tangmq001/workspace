package tang.ming.qiao.service;


import tang.ming.qiao.domain.User;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:tangmq
 * @Date:2017/7/14
 * @Note:
 */
public interface IUserService {
    void delete(Integer id);

    List<User> getAll();
}
