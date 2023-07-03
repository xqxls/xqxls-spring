package cn.xqxls.springframework.beans.factory.support;

import cn.xqxls.springframework.beans.BeansException;
import cn.xqxls.springframework.beans.factory.config.BeanDefinition;

/**
 * @author xqxls
 * @create 2023-07-03 16:23
 * @Description
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }

}
