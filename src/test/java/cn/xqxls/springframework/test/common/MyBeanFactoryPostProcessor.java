package cn.xqxls.springframework.test.common;


import cn.xqxls.springframework.beans.BeansException;
import cn.xqxls.springframework.beans.PropertyValue;
import cn.xqxls.springframework.beans.PropertyValues;
import cn.xqxls.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.xqxls.springframework.beans.factory.config.BeanDefinition;
import cn.xqxls.springframework.beans.factory.config.BeanFactoryPostProcessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }

}
