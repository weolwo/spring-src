package com.poplar.proxy.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

/**
 * Create BY poplar ON 2021/1/3
 * cglib生成代理对象
 */
public class CglibCalculatorTest {

    public static void main(String[] args) {

        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E:\\logs\\");
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(CglibCustomizeCalculator.class);
        //设置回调
        enhancer.setCallback(new CalculatorMethodInterceptor());
        //创建代理对象
        CglibCustomizeCalculator proxyInstance = (CglibCustomizeCalculator) enhancer.create();
        //通过代理对象调用目标方法
        proxyInstance.add(1, 2);
        proxyInstance.sub(5, 2);
    }
}
