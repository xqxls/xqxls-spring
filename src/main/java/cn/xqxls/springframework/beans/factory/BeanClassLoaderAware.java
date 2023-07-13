package cn.xqxls.springframework.beans.factory;

/**
 * @author xqxls
 * @create 2023-07-13 13:14
 * @Description 实现此接口，既能感知到所属的 ClassLoader
 */
public interface BeanClassLoaderAware extends Aware{

    void setBeanClassLoader(ClassLoader classLoader);
}
