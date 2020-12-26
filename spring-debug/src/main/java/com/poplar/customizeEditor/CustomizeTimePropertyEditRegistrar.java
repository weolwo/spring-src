package com.poplar.customizeEditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import java.util.Date;

/**
 * Create BY poplar ON 2020/12/25
 * 调用时机
 * <hr>
 * <pre class="code">
 * protected void initBeanWrapper(BeanWrapper bw) {
 * bw.setConversionService(getConversionService());
 * registerCustomEditors(bw);
 * }
 */
public class CustomizeTimePropertyEditRegistrar implements PropertyEditorRegistrar {


    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        registry.registerCustomEditor(Date.class, new CustomizeDatePropertyEditor());
    }
}
