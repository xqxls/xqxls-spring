package cn.xqxls.springframework.beans.factory.config;

import cn.xqxls.springframework.beans.BeansException;
import cn.xqxls.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author xqxls
 * @create 2023-07-12 16:13
 * @Description
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}
