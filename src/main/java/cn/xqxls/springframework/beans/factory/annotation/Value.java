package cn.xqxls.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @author xqxls
 * @create 2023-07-19 16:54
 * @Description Annotation at the field or method/constructor parameter level
 * that indicates a default value expression for the affected argument.
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Value {

    /**
     * The actual value expression: e.g. "#{systemProperties.myProp}".
     */
    String value();

}
