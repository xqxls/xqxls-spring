package cn.xqxls.springframework.context.support;

import cn.xqxls.springframework.beans.factory.FactoryBean;
import cn.xqxls.springframework.beans.factory.InitializingBean;
import cn.xqxls.springframework.core.convert.ConversionService;
import cn.xqxls.springframework.core.convert.converter.Converter;
import cn.xqxls.springframework.core.convert.converter.ConverterFactory;
import cn.xqxls.springframework.core.convert.converter.ConverterRegistry;
import cn.xqxls.springframework.core.convert.converter.GenericConverter;
import cn.xqxls.springframework.core.convert.support.DefaultConversionService;
import cn.xqxls.springframework.core.convert.support.GenericConversionService;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

/**
 * @author xqxls
 * @create 2023-07-24 17:54
 * @Description
 */
public class ConversionServiceFactoryBean implements FactoryBean<ConversionService>, InitializingBean {

    @Nullable
    private Set<?> converters;

    @Nullable
    private GenericConversionService conversionService;

    @Override
    public ConversionService getObject() throws Exception {
        return conversionService;
    }

    @Override
    public Class<?> getObjectType() {
        return conversionService.getClass();
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.conversionService = new DefaultConversionService();
        registerConverters(converters, conversionService);
    }

    private void registerConverters(Set<?> converters, ConverterRegistry registry) {
        if (converters != null) {
            for (Object converter : converters) {
                if (converter instanceof GenericConverter) {
                    registry.addConverter((GenericConverter) converter);
                } else if (converter instanceof Converter<?, ?>) {
                    registry.addConverter((Converter<?, ?>) converter);
                } else if (converter instanceof ConverterFactory<?, ?>) {
                    registry.addConverterFactory((ConverterFactory<?, ?>) converter);
                } else {
                    throw new IllegalArgumentException("Each converter object must implement one of the " +
                            "Converter, ConverterFactory, or GenericConverter interfaces");
                }
            }
        }
    }

    public void setConverters(Set<?> converters) {
        this.converters = converters;
    }

}