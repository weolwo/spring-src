package com.poplar.test;

import com.poplar.bean.Pet;
import org.junit.Test;
import org.springframework.cglib.core.Constants;
import org.springframework.cglib.reflect.FastClass;

import java.lang.reflect.Method;

/**
 * Create BY poplar ON 2020/12/23
 * Cglib中提供FastClass增强功能，FastClass顾名思义是一个能让被增强类更快调用的Class，主要针对调用方法是变量的场景，用于替代反射调用。
 * FastClass的实现逻辑，是生成增强类实现invoke方法，invoke方法中，用switch语义将被增强类的所有方法调用枚举出来。
 * 用户使用FastClass.invoke方法，传入方法签名和被调用实例，从而达到不使用反射就能实现不确定方法的调用。
 */
public class FastClassTest {


    //515462599,328821700,322340900
    @Test
    public void testFastClass() throws Exception {
        Pet p = new Pet();
        p.setName("猫花");
        p.setWeight(22.1);

        long start = System.nanoTime();
        FastClass fastA = FastClass.create(Pet.class);
        for (int i = 0; i < 10000000; i++) {
            fastA.invoke("getWeight", Constants.EMPTY_CLASS_ARRAY, p, new Object[]{});
        }
        long end = System.nanoTime();
        System.out.println(end - start);
    }

    //52066901,57409501,56813500
    @Test
    public void testReflex() throws Exception {
        Pet p = new Pet();
        p.setName("猫花");
        p.setWeight(22.1);


        long start = System.nanoTime();
        Method getWeight = Pet.class.getMethod("getWeight");
        for (int i = 0; i < 10000000; i++) {
            getWeight.invoke(p);
        }
        long end = System.nanoTime();
        System.out.println(end - start);
    }
}
