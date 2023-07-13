package cn.xqxls.springframework.beans.factory;

/**
 * @author xqxls
 * @create 2023-07-13 09:48
 * @Description
 */
public interface DisposableBean {

    void destroy() throws Exception;

}
