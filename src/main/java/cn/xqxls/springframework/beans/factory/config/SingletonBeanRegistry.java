package cn.xqxls.springframework.beans.factory.config;

/**
 * @author xqxls
 * @create 2023-07-03 16:11
 * @Description
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);
}
