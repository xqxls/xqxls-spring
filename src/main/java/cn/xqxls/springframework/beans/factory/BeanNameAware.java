package cn.xqxls.springframework.beans.factory;

/**
 * @author xqxls
 * @create 2023-07-13 13:15
 * @Description 实现此接口，既能感知到所属的 BeanName
 */
public interface BeanNameAware extends Aware{

    void setBeanName(String name);
}
