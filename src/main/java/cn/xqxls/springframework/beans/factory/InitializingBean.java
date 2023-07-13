package cn.xqxls.springframework.beans.factory;

/**
 * @author xqxls
 * @create 2023-07-13 09:47
 * @Description
 */
public interface InitializingBean {

    /**
     * Bean 处理了属性填充后调用
     *
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;

}