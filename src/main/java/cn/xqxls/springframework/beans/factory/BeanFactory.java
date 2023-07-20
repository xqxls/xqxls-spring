package cn.xqxls.springframework.beans.factory;

import cn.xqxls.springframework.beans.BeansException;

/**
 * @author xqxls
 * @create 2023-07-03 16:19
 * @Description
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

    <T> T getBean(Class<T> requiredType) throws BeansException;
}
