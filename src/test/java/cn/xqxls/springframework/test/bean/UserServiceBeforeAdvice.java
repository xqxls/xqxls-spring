package cn.xqxls.springframework.test.bean;

import cn.xqxls.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author xqxls
 * @create 2023-07-20 11:46
 * @Description
 */
public class UserServiceBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("拦截方法：" + method.getName());
    }

}