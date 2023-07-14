package cn.xqxls.springframework.context;

import cn.xqxls.springframework.beans.factory.HierarchicalBeanFactory;
import cn.xqxls.springframework.beans.factory.ListableBeanFactory;
import cn.xqxls.springframework.core.io.ResourceLoader;

/**
 * @author xqxls
 * @create 2023-07-12 16:16
 * @Description
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher  {
}
