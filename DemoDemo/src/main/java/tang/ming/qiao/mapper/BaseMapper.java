package tang.ming.qiao.mapper;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:tangmq
 * @Date:2017/7/14
 * @Note:
 */
public interface BaseMapper<T> {
    //void insert(T t);
    //void update(T t);
    void delete(Serializable id);
    List<T> getAll();
}
