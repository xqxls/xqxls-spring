package cn.xqxls.springframework.test;

import cn.xqxls.springframework.context.support.ClassPathXmlApplicationContext;
import cn.xqxls.springframework.test.bean2.IUserService;
import org.junit.Test;

/**
 * @author xqxls
 * @create 2023-07-03 15:16
 * @Description
 */
public class ApiTest {

//    @Test
//    public void test_autoProxy() {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
//        IUserService userService = applicationContext.getBean("userService", IUserService.class);
//        System.out.println("测试结果：" + userService.queryUserInfo());
//    }

    @Test
    public void test_autoProxy_2() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring2.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }

}