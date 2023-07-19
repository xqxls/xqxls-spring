package cn.xqxls.springframework.context.annotation;

import java.lang.annotation.*;

/**
 * @author xqxls
 * @create 2023-07-18 17:18
 * @Description
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Scope {

    String value() default "singleton";

}
