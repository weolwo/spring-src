package com.poplar.proxy.cglib;

/**
 * Create BY poplar ON 2020/4/17
 */

public class CglibCustomizeCalculator {


    public Integer add(int x, int y) {
        System.out.println("add 运行。。。");
        return x + y;
    }

    public Integer sub(int x, int y) {
        return x - y;
    }

    public final Integer div(int x, int y) {
        System.out.println("div 运行。。。");
        return x / y;
    }
}
