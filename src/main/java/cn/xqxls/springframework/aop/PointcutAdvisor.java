package cn.xqxls.springframework.aop;

/**
 * @author xqxls
 * @create 2023-07-18 15:10
 * @Description
 */
public interface PointcutAdvisor extends Advisor {

    /**
     * Get the Pointcut that drives this advisor.
     */
    Pointcut getPointcut();

}
