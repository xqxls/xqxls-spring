package cn.xqxls.springframework.test;

import cn.xqxls.springframework.context.support.ClassPathXmlApplicationContext;
import cn.xqxls.springframework.core.convert.converter.Converter;
import cn.xqxls.springframework.core.convert.support.StringToNumberConverterFactory;
import cn.xqxls.springframework.test.bean.Husband;
import cn.xqxls.springframework.test.converter.StringToIntegerConverter;
import cn.xqxls.springframework.test.converter.StringToLocalDateConverter;
import org.junit.Test;

import java.time.LocalDate;

/**
 * @author xqxls
 * @create 2023-07-03 15:16
 * @Description
 */
public class ApiTest {

    @Test
    public void test_convert() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        Husband husband = applicationContext.getBean("husband", Husband.class);
        System.out.println("测试结果：" + husband);
    }

    @Test
    public void test_StringToIntegerConverter() {
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer num = converter.convert("1234");
        System.out.println("测试结果：" + num);
    }

    @Test
    public void test_StringToLocalDateConverter() {
        StringToLocalDateConverter converter = new StringToLocalDateConverter("yyyy-MM-dd");
        LocalDate localDate = converter.convert("2021-08-08");
        System.out.println("测试结果：" + localDate);
    }

    @Test
    public void test_StringToNumberConverterFactory() {
        StringToNumberConverterFactory converterFactory = new StringToNumberConverterFactory();

        Converter<String, Integer> stringToIntegerConverter = converterFactory.getConverter(Integer.class);
        System.out.println("测试结果：" + stringToIntegerConverter.convert("1234"));

        Converter<String, Long> stringToLongConverter = converterFactory.getConverter(Long.class);
        System.out.println("测试结果：" + stringToLongConverter.convert("1234"));
    }


}