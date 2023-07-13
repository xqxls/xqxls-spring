package cn.xqxls.springframework.beans.factory;

/**
 * @author xqxls
 * @create 2023-07-13 16:17
 * @Description
 */
public interface FactoryBean<T> {

    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();

}
