package tang.ming.qiao.web.cache;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import tang.ming.qiao.domain.UserInfo;
import tang.ming.qiao.service.IUserInfoService;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author:tangmq
 * @Date:2017/7/17
 * @Note:
 */
@Component
public class UserCache implements InitializingBean ,DisposableBean{
    private static final Logger LOGGER= LoggerFactory.getLogger(UserCache.class);
    //线程池大小,设置为电脑核数的两倍
    private static final Integer POOL_SIZE=Runtime.getRuntime().availableProcessors()*2;
    //缓存执行间隔
    @Value("${cache.redis.cacheExpire}")
    private long cacheExpire;
    //指定执行任务类
    private ScheduledThreadPoolExecutor executor=null;
    @Resource
    private RedisTemplate<String ,String> redisTemplate;
    @Resource
    private IUserInfoService userService;

    @Override
    public void afterPropertiesSet() throws Exception {
        executor = new ScheduledThreadPoolExecutor(POOL_SIZE);
        RefreshCache rct = new RefreshCache();
        rct.run();
        executor.scheduleWithFixedDelay(rct,cacheExpire,cacheExpire, TimeUnit.SECONDS);

    }

    @Override
    public void destroy() throws Exception {
        executor.shutdownNow();
    }
    private class RefreshCache implements Runnable{
        @Override
        public void run() {
            LOGGER.info("------开始刷新缓存------");
            redisTemplate.delete(redisTemplate.keys("USER*"));
            List<UserInfo> list = userService.getAll();
            if(list.size()>0){
                for(UserInfo userInfo:list){
                    redisTemplate.opsForValue().set("USER"+userInfo.getId(), JSON.toJSONString(userInfo));
                }
            }
            LOGGER.info("------结束刷新缓存------");
        }
    }
}
