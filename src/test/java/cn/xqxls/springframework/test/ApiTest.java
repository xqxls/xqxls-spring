package cn.xqxls.springframework.test;


import cn.xqxls.springframework.BeanDefinition;
import cn.xqxls.springframework.BeanFactory;
import cn.xqxls.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author xqxls
 * @create 2023-07-03 15:16
 * @Description
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}