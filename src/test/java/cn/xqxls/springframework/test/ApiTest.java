package cn.xqxls.springframework.test;

import cn.xqxls.springframework.context.support.ClassPathXmlApplicationContext;
import cn.xqxls.springframework.test.event.CustomEvent;
import org.junit.Test;

/**
 * @author xqxls
 * @create 2023-07-03 15:16
 * @Description
 */
public class ApiTest {

    @Test
    public void test_event() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 1019129009086763L, "成功了！"));

        applicationContext.registerShutdownHook();
    }

}