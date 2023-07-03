package cn.xqxls.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xqxls
 * @create 2023-07-03 15:14
 * @Description
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
