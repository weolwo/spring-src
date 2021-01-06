package com.poplar.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Create BY poplar ON 2021/1/3
 */
public class CalculatorMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        print("方法开始");
        Object result = method.invoke(o, objects);
        print("方法结束");
        return result;
    }

    public void print(String s) {
        System.out.println(s);
    }
}
