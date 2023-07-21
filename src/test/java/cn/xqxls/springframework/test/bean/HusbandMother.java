package cn.xqxls.springframework.test.bean;

import cn.xqxls.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

/**
 * @author xqxls
 * @create 2023-07-21 14:36
 * @Description
 */
public class HusbandMother implements FactoryBean<IMother> {

    @Override
    public IMother getObject() throws Exception {
        return (IMother) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{IMother.class}, (proxy, method, args) -> "婚后媳妇妈妈的职责被婆婆代理了！" + method.getName());
    }

    @Override
    public Class<?> getObjectType() {
        return IMother.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

}