package com.kurtz.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityProxy implements InvocationHandler {

    private Object object;

    private SecurityProxy(Object object) {
        this.object = object;
    }

    public static Object newInstance(Object object) {
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(), new SecurityProxy(object));
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;

        if (method.getName().contains("post")) {
            throw new IllegalAccessException("Posts are currently not allowed");
        }

        result = method.invoke(object, args);

        return result;
    }
}
