package com.sejin.springbootpractice.dto.converter;

import org.modelmapper.AbstractConverter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToStringConverter extends AbstractConverter<Date, String> {

    @Override
    protected String convert(Date source) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        return source == null ? null : dateFormat.format(source);
    }
}
