package com.hdd.example.editor;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hdd
 * @description:
 * @date 2024年11月22日
 */
public class StringToDateConvert implements Converter<String, Date> {
    private String format;
    @Override
    public Date convert(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(source);
        } catch (Exception e) {
            System.out.println("日期转换失败");
        }
        return null;
    }

    @Override
    public <U> Converter<String, U> andThen(Converter<? super Date, ? extends U> after) {
        return Converter.super.andThen(after);
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
