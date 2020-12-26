package com.poplar.customizeEditor;

import org.springframework.lang.Nullable;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Create BY poplar ON 2020/12/25
 * 调用时机
 * 属性填充做值转换的时候
 * <pre class="code">
 * private Object doConvertTextValue(@Nullable Object oldValue, String newTextValue, PropertyEditor editor) {
 * editor.setAsText(newTextValue);
 * return editor.getValue();*
 * }
 */
public class CustomizeDatePropertyEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(@Nullable String text) throws IllegalArgumentException {
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(text);
            setValue(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
