package cn.xqxls.springframework.context.event;

import cn.xqxls.springframework.beans.factory.BeanFactory;
import cn.xqxls.springframework.context.ApplicationEvent;
import cn.xqxls.springframework.context.ApplicationListener;

/**
 * @author xqxls
 * @create 2023-07-14 14:03
 * @Description
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void multicastEvent(ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }
}
