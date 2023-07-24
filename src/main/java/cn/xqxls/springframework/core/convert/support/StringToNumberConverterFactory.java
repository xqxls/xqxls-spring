package cn.xqxls.springframework.core.convert.support;

import cn.xqxls.springframework.core.convert.converter.Converter;
import cn.xqxls.springframework.core.convert.converter.ConverterFactory;
import cn.xqxls.springframework.util.NumberUtils;
import org.jetbrains.annotations.Nullable;

/**
 * @author xqxls
 * @create 2023-07-24 17:33
 * @Description
 */
public class StringToNumberConverterFactory implements ConverterFactory<String, Number> {

    @Override
    public <T extends Number> Converter<String, T> getConverter(Class<T> targetType) {
        return new StringToNumber<>(targetType);
    }

    private static final class StringToNumber<T extends Number> implements Converter<String, T> {

        private final Class<T> targetType;

        public StringToNumber(Class<T> targetType) {
            this.targetType = targetType;
        }

        @Override
        @Nullable
        public T convert(String source) {
            if (source.isEmpty()) {
                return null;
            }
            return NumberUtils.parseNumber(source, this.targetType);
        }
    }
}
