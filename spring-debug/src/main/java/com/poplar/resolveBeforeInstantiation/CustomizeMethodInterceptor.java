package com.poplar.resolveBeforeInstantiation;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Create BY poplar ON 2020/12/30
 */
public class CustomizeMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("目标方法执行之前：" + method);
        Object obj = methodProxy.invokeSuper(o, objects);
        System.out.println("目标方法执行之后：" + method);
        return obj;
    }
}
