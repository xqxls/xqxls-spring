package cn.xqxls.springframework.context;

import java.util.EventObject;

/**
 * @author xqxls
 * @create 2023-07-14 13:45
 * @Description
 */
public abstract class ApplicationEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }

}
