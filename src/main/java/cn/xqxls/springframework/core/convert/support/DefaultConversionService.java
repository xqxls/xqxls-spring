package cn.xqxls.springframework.core.convert.support;

import cn.xqxls.springframework.core.convert.converter.ConverterRegistry;

/**
 * @author xqxls
 * @create 2023-07-24 17:32
 * @Description
 */
public class DefaultConversionService extends GenericConversionService{

    public DefaultConversionService() {
        addDefaultConverters(this);
    }

    public static void addDefaultConverters(ConverterRegistry converterRegistry) {
        // 添加各类类型转换工厂
        converterRegistry.addConverterFactory(new StringToNumberConverterFactory());
    }

}
