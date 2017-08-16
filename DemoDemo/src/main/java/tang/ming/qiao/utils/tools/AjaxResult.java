package tang.ming.qiao.utils.tools;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ajax请求返回结果类
 */
public class AjaxResult extends HashMap {

    public static Map success() {
        return result(true, "操作成功");
    }

    public static Map success(String message) {
        return result(true, message);
    }

    public static Map fail() {
        return result(false, "操作失败");
    }

    public static Map fail(String message) {
        return result(false, message);
    }

    public static Map fail(Object object, String message) {
        return result(false, message, object);
    }

    private static Map result(boolean b, String message, Object object) {
        Map result = new HashMap();
        result.put("success", b);
        result.put("message", message);
        result.put("data", object);
        return result;
    }

    public static Map result(boolean flag, String message) {
        Map result = new HashMap();
        result.put("success", flag);
        result.put("message", message);
        return result;
    }

    public static Map result(List<?> list, int count) {
        Map result = new HashMap();
        result.put("data", list);
        result.put("count", count);
        return result;
    }

    public static Map result(List<?> list) {
        Map result = new HashMap();
        result.put("data", list);
        return result;
    }

    public static Map success(Object object) {
        Map result = new HashMap();
        result.put("success", true);
        result.put("message", "获取数据成功");
        result.put("data", object);
        return result;
    }
}
