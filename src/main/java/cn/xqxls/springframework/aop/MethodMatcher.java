package cn.xqxls.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author xqxls
 * @create 2023-07-18 09:26
 * @Description
 */
public interface MethodMatcher {

    /**
     * Perform static checking whether the given method matches. If this
     * @return whether or not this method matches statically
     */
    boolean matches(Method method, Class<?> targetClass);
}
