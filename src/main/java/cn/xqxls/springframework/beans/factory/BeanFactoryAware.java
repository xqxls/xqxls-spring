package cn.xqxls.springframework.beans.factory;

import cn.xqxls.springframework.beans.BeansException;
import cn.xqxls.springframework.beans.factory.Aware;

/**
 * @author xqxls
 * @create 2023-07-13 13:12
 * @Description 实现此接口，既能感知到所属的 BeanFactory
 */
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
