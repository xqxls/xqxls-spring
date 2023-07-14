package cn.xqxls.springframework.context.event;

/**
 * @author xqxls
 * @create 2023-07-14 13:48
 * @Description
 */
public class ContextRefreshedEvent extends ApplicationContextEvent{
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextRefreshedEvent(Object source) {
        super(source);
    }

}
