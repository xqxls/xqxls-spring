package cn.xqxls.springframework.test.bean;

import cn.xqxls.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author xqxls
 * @create 2023-07-21 14:36
 * @Description
 */
public class SpouseAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("关怀小两口(切面)：" + method);
    }

}
