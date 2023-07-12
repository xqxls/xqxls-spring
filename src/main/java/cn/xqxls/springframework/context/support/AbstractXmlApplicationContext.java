package cn.xqxls.springframework.context.support;

import cn.xqxls.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.xqxls.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author xqxls
 * @create 2023-07-12 16:35
 * @Description
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();

}
