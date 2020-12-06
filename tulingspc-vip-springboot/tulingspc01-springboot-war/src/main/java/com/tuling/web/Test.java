package com.tuling.web;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Factory;

/**
 * @author zhushaowei
 * @create 2020-11-17 7:04
 */
public class Test implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new User();
        wait();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
