package cn.xqxls.springframework.beans.factory.support;

import cn.xqxls.springframework.beans.factory.config.BeanDefinition;

/**
 * @author xqxls
 * @create 2023-07-03 16:24
 * @Description
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}