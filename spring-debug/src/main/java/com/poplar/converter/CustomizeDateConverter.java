package com.poplar.converter;

import com.poplar.bean.Apple;
import org.springframework.core.convert.converter.Converter;

/**
 * Create BY poplar ON 2020/12/29
 * 由于spring提供的属性编辑器，接受的参数只能是String，所以需要converter
 */
public class CustomizeDateConverter implements Converter<String, Apple> {


    @Override
    public Apple convert(String source) {
        System.out.println("---------CustomizeDateConverter---------");
        Apple apple = new Apple();
        apple.setColor(source.toUpperCase());
        return apple;
    }
}
