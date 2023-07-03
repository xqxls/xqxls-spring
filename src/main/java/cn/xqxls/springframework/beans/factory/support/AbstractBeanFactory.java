package cn.xqxls.springframework.beans.factory.support;

import cn.xqxls.springframework.beans.BeansException;
import cn.xqxls.springframework.beans.factory.BeanFactory;
import cn.xqxls.springframework.beans.factory.config.BeanDefinition;

/**
 * @author xqxls
 * @create 2023-07-03 16:23
 * @Description
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}

