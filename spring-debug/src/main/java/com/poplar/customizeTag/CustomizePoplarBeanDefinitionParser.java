package com.poplar.customizeTag;

import com.poplar.bean.Poplar;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * Create BY poplar ON 2020/12/25
 * 自定义标签指定标签的解析类
 */
public class CustomizePoplarBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return Poplar.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {

        String name = element.getAttribute("name");
        String id = element.getAttribute("id");
        String job = element.getAttribute("job");
        if (StringUtils.hasText(name)) {
            builder.addPropertyValue("name", name);
        }

        if (StringUtils.hasText(id)) {
            builder.addPropertyValue("id", id);
        }

        if (StringUtils.hasText(job)) {
            builder.addPropertyValue("job", job);
        }
    }
}
