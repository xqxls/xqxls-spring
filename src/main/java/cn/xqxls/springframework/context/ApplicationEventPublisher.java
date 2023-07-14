package cn.xqxls.springframework.context;

/**
 * @author xqxls
 * @create 2023-07-14 13:54
 * @Description
 */
public interface ApplicationEventPublisher {

    /**
     * Notify all listeners registered with this application of an application
     * event. Events may be framework events (such as RequestHandledEvent)
     * or application-specific events.
     * @param event the event to publish
     */
    void publishEvent(ApplicationEvent event);
}
