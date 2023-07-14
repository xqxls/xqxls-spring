package cn.xqxls.springframework.context;

import java.util.EventListener;

/**
 * @author xqxls
 * @create 2023-07-14 13:57
 * @Description
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    /**
     * Handle an application event.
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);

}