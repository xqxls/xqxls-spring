package cn.xqxls.springframework.test.event;


import cn.xqxls.springframework.context.ApplicationListener;
import cn.xqxls.springframework.context.event.ContextClosedEvent;

public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("关闭事件：" + this.getClass().getName());
    }

}
