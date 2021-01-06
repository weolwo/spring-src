package com.poplar.proxy.jdk;

import com.poplar.proxy.Calculator;

/**
 * Create BY poplar ON 2020/4/17
 */

public class JdkCustomizeCalculator implements Calculator {


    @Override
    public Integer add(int x, int y) {
        System.out.println("add 运行。。。");
        return x + y;
    }

    @Override
    public Integer sub(int x, int y) {
        return x - y;
    }

    public final Integer div(int x, int y) {
        System.out.println("div 运行。。。");
        return x / y;
    }
}
