package cn.xqxls.springframework.stereotype;

import java.lang.annotation.*;

/**
 * @author xqxls
 * @create 2023-07-18 17:20
 * @Description Indicates that an annotated class is a "component".
 * Such classes are considered as candidates for auto-detection
 * when using annotation-based configuration and classpath scanning.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {

    String value() default "";

}
