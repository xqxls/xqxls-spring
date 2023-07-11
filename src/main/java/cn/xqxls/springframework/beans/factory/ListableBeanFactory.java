package cn.xqxls.springframework.beans.factory;

import cn.xqxls.springframework.beans.BeansException;

import java.util.Map;

/**
 * @author xqxls
 * @create 2023-07-11 17:56
 * @Description
 */
public interface ListableBeanFactory extends BeanFactory{

    /**
     * 按照类型返回 Bean 实例
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * Return the names of all beans defined in this registry.
     *
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();

}
