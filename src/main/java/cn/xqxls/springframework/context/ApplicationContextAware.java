package cn.xqxls.springframework.context;

import cn.xqxls.springframework.beans.BeansException;
import cn.xqxls.springframework.beans.factory.Aware;

/**
 * @author xqxls
 * @create 2023-07-13 13:16
 * @Description 实现此接口，既能感知到所属的 ApplicationContext
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
