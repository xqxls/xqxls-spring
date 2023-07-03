package cn.xqxls.springframework;

/**
 * @author xqxls
 * @create 2023-07-03 15:14
 * @Description
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
