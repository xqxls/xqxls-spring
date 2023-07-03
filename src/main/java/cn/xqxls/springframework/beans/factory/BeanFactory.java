package cn.xqxls.springframework.beans.factory;

import cn.xqxls.springframework.beans.BeansException;

/**
 * @author xqxls
 * @create 2023-07-03 16:19
 * @Description
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
