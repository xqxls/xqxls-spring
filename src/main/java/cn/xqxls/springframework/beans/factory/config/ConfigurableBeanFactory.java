package cn.xqxls.springframework.beans.factory.config;

import cn.xqxls.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @author xqxls
 * @create 2023-07-11 17:57
 * @Description
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

}