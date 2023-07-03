package cn.xqxls.springframework.beans;

/**
 * @author xqxls
 * @create 2023-07-03 16:16
 * @Description
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
