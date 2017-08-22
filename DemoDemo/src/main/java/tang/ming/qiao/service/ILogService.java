package tang.ming.qiao.service;

import tang.ming.qiao.domain.UserInfo;

/**
 * @Author:tangmq
 * @Date:2017/7/19
 * @Note:
 */
public interface ILogService {
    /**
     * 根据用户名和密码匹配用户
     * @param username
     * @param password
     * @return
     */
    UserInfo checkAssign(String username, String password);

    /**
     * 忘记密码修改
     * @param tel
     * @param psd
     */
    void changePsd(String tel, String psd);
}
