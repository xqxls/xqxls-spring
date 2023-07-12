package cn.xqxls.springframework.beans.factory.support;

import cn.xqxls.springframework.beans.BeansException;
import cn.xqxls.springframework.core.io.Resource;
import cn.xqxls.springframework.core.io.ResourceLoader;

/**
 * @author xqxls
 * @create 2023-07-11 17:44
 * @Description
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;

}