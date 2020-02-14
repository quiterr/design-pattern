package com.quiterr.dynamic;

import java.lang.reflect.Array;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/**
 * @author huangchen
 * @date 2019/12/23
 */
public class ProxyFactory {
    public static Object newInstance(Object ob) {
        return Proxy.newProxyInstance(ob.getClass().getClassLoader(),
                new Class<?>[] { Task.class }, new MyInvocationHandler(ob));
    }
}
