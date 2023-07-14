package cn.xqxls.springframework.context.event;

import cn.xqxls.springframework.context.ApplicationEvent;
import cn.xqxls.springframework.context.ApplicationListener;

/**
 * @author xqxls
 * @create 2023-07-14 13:56
 * @Description
 */
public interface ApplicationEventMulticaster {

    /**
     * Add a listener to be notified of all events.
     * @param listener the listener to add
     */
    void addApplicationListener(ApplicationListener<?> listener);

    /**
     * Remove a listener from the notification list.
     * @param listener the listener to remove
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * Multicast the given application event to appropriate listeners.
     * @param event the event to multicast
     */
    void multicastEvent(ApplicationEvent event);

}
