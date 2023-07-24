package cn.xqxls.springframework.core.convert;

import org.jetbrains.annotations.Nullable;

/**
 * @author xqxls
 * @create 2023-07-24 17:29
 * @Description 类型转换抽象接口
 */
public interface ConversionService {

    /** Return {@code true} if objects of {@code sourceType} can be converted to the {@code targetType}. */
    boolean canConvert(@Nullable Class<?> sourceType, Class<?> targetType);

    /** Convert the given {@code source} to the specified {@code targetType}. */
    <T> T convert(Object source, Class<T> targetType);

}
