package cn.xqxls.springframework.aop;

import org.aopalliance.aop.Advice;

/**
 * @author xqxls
 * @create 2023-07-18 15:10
 * @Description
 */
public interface Advisor {

    /**
     * Return the advice part of this aspect. An advice may be an
     * interceptor, a before advice, a throws advice, etc.
     * @return the advice that should apply if the pointcut matches
     * @see org.aopalliance.intercept.MethodInterceptor
     * @see BeforeAdvice
     */
    Advice getAdvice();
}
