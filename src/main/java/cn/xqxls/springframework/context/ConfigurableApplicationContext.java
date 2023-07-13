package cn.xqxls.springframework.context;

import cn.xqxls.springframework.beans.BeansException;

/**
 * @author xqxls
 * @create 2023-07-12 16:17
 * @Description
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();


}
