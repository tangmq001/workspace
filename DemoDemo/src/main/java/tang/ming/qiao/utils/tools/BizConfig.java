package tang.ming.qiao.utils.tools;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Jacky
 */
//@Configuration("urmsBizConfig")
//@ImportResource("classpath:properties-config.xml")
public class BizConfig {

    private
    @Value("#{platform['cloud.base.url']}")
    String baseURL;

    private
    @Value("#{platform['page.size']}")
    String pageSize;

    private
    @Value("#{platform['sms.url']}")
    String smsUrl;

    private
    @Value("#{platform['sms.appkey']}")
    String smsAppKey;

    private
    @Value("#{platform['sms.secret']}")
    String smsSecret;


    private
    @Value("#{platform['sms.timeslimit']}")
    int timesLimit;

    private
    @Value("#{platform['sms.life']}")
    int smsLife;

    private
    @Value("#{platform['sms.sign']}")
    String smsSign;

    private
    @Value("#{platform['sms.template']}")
    String smsTemplate;

    public Integer getPageSize() {
        int size = Integer.valueOf(pageSize);
        if (size <= 0)
            return 15;
        else
            return size;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getSmsUrl() {
        return smsUrl;
    }

    public void setSmsUrl(String smsUrl) {
        this.smsUrl = smsUrl;
    }

    public String getSmsAppKey() {
        return smsAppKey;
    }

    public void setSmsAppKey(String smsAppKey) {
        this.smsAppKey = smsAppKey;
    }

    public String getSmsSecret() {
        return smsSecret;
    }

    public void setSmsSecret(String smsSecret) {
        this.smsSecret = smsSecret;
    }

    public int getTimesLimit() {
        return timesLimit;
    }

    public void setTimesLimit(int timesLimit) {
        this.timesLimit = timesLimit;
    }

    public int getSmsLife() {
        return smsLife;
    }

    public void setSmsLife(int smsLife) {
        this.smsLife = smsLife;
    }

    public String getBaseURL() {
        return baseURL;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

    public String getSmsSign() {
        return smsSign;
    }

    public void setSmsSign(String smsSign) {
        this.smsSign = smsSign;
    }

    public String getSmsTemplate() {
        return smsTemplate;
    }

    public void setSmsTemplate(String smsTemplate) {
        this.smsTemplate = smsTemplate;
    }
}
