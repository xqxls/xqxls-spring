package cn.xqxls.springframework.context.event;

import cn.xqxls.springframework.context.ApplicationContext;
import cn.xqxls.springframework.context.ApplicationEvent;

/**
 * @author xqxls
 * @create 2023-07-14 13:46
 * @Description
 */
public class ApplicationContextEvent extends ApplicationEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    /**
     * Get the <code>ApplicationContext</code> that the event was raised for.
     */
    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }

}
