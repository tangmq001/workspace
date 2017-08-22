package tang.ming.qiao.service;

/**
 * @Author:tangmq
 * @Date:2017/8/21
 * @Note:
 */
public interface ISendSMSService {
    /**
     * 发送验证码
     * @param telephone
     * @param sign
     * @param template
     * @return
     */
    String sendValCode(String telephone, String sign, String template);

    /**
     * 发送验证码
     * @param telephone
     * @param valCode
     * @param sign
     * @param template
     * @return
     */
    Boolean sendValCode(String telephone, String valCode, String sign, String template)throws Exception;

}
