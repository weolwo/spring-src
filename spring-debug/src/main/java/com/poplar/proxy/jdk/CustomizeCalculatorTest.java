package com.poplar.proxy.jdk;

import com.poplar.proxy.Calculator;

import java.lang.reflect.Proxy;

/**
 * Create BY poplar ON 2021/1/3
 * jdk方式生成代理对象
 */
public class CustomizeCalculatorTest {

    public static void main(String[] args) {
        //把生成的字节码文件保存起来
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        JdkCustomizeCalculator calculator = new JdkCustomizeCalculator();
        ClassLoader classLoader = CustomizeCalculatorTest.class.getClassLoader();
        Class<?>[] interfaces = calculator.getClass().getInterfaces();

        Calculator proxyInstance = (Calculator) Proxy.newProxyInstance(classLoader, interfaces,
                (proxy, method, args1) -> method.invoke(calculator, args1));

        proxyInstance.add(1, 2);
        proxyInstance.sub(2, 1);
    }
}
