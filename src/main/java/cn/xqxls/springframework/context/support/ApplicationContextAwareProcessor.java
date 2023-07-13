package cn.xqxls.springframework.context.support;

import cn.xqxls.springframework.beans.BeansException;
import cn.xqxls.springframework.beans.factory.config.BeanPostProcessor;
import cn.xqxls.springframework.context.ApplicationContext;
import cn.xqxls.springframework.context.ApplicationContextAware;

/**
 * @author xqxls
 * @create 2023-07-13 13:19
 * @Description
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware){
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}

