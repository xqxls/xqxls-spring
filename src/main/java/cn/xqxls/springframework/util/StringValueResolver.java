package cn.xqxls.springframework.util;

/**
 * @author xqxls
 * @create 2023-07-19 14:09
 * @Description Simple strategy interface for resolving a String value.
 */
public interface StringValueResolver {

    String resolveStringValue(String strVal);
}
