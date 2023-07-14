package cn.xqxls.springframework.test.event;

import cn.xqxls.springframework.context.ApplicationListener;

import java.util.Date;

/**
 * @author xqxls
 * @create 2023-07-14 14:45
 * @Description
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("收到：" + event.getSource() + "消息;时间：" + new Date());
        System.out.println("消息：" + event.getId() + ":" + event.getMessage());
    }

}
