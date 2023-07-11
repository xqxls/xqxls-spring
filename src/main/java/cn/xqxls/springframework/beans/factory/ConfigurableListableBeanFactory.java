package cn.xqxls.springframework.beans.factory;

import cn.xqxls.springframework.beans.BeansException;
import cn.xqxls.springframework.beans.factory.config.AutowireCapableBeanFactory;
import cn.xqxls.springframework.beans.factory.config.BeanDefinition;
import cn.xqxls.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author xqxls
 * @create 2023-07-11 17:55
 * @Description
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
