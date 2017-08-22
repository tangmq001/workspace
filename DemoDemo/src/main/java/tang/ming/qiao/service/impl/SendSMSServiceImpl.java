package tang.ming.qiao.service.impl;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;
import org.springframework.stereotype.Service;
import tang.ming.qiao.service.ISendSMSService;

import java.util.Random;

/**
 * @Author:tangmq
 * @Date:2017/8/21
 * @Note:
 */
@Service("sendSMS")
public class SendSMSServiceImpl implements ISendSMSService {
    //@Resource
    //private BizConfig bizConfig;

    @Override
    public String sendValCode(String telephone, String sign, String template) {
        String code = null;
        try {
            code = "";
            Random random = new Random();
            for (int i = 0; i < 6; i++) {
                code += random.nextInt(10);
            }
            sendValCode(telephone, code, sign, template);
            return code;
        } catch (Exception e) {
            e.printStackTrace();
            return "-1";
        }

    }

    @Override
    public Boolean sendValCode(String telephone, String valCode, String sign, String template) throws Exception{
        try {
            DefaultTaobaoClient client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", "23891193", "ff8279a7560705d1d656fed611772439");
            AlibabaAliqinFcSmsNumSendRequest request = new AlibabaAliqinFcSmsNumSendRequest();
            request.setExtend("");
            request.setSmsType("normal");
            request.setSmsFreeSignName("新思维在线");
            request.setSmsParamString("{\"code\":\"" + valCode + "\"}");
            request.setRecNum(telephone);
            request.setSmsTemplateCode(template);
            AlibabaAliqinFcSmsNumSendResponse execute = (AlibabaAliqinFcSmsNumSendResponse)client.execute(request);
            Boolean success = execute.getResult().getSuccess().booleanValue();
            return success;
        } catch (ApiException e) {
            e.printStackTrace();
            throw e;
        }
    }

}
