package cn.xqxls.springframework.beans.factory;

import cn.xqxls.springframework.beans.BeansException;

/**
 * @author xqxls
 * @create 2023-07-21 13:58
 * @Description Defines a factory which can return an Object instance
 * (possibly shared or independent) when invoked.
 */
public interface ObjectFactory<T> {

    T getObject() throws BeansException;

}