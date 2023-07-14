package cn.xqxls.springframework.test.event;


import cn.xqxls.springframework.context.ApplicationListener;
import cn.xqxls.springframework.context.event.ContextRefreshedEvent;

public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("刷新事件：" + this.getClass().getName());
    }

}
