package com.sejin.springbootpractice.dto.mapper;

import com.sejin.springbootpractice.dto.converter.DateToStringConverter;
import com.sejin.springbootpractice.dto.res.CatResponseDto;
import com.sejin.springbootpractice.model.Cat;
import org.modelmapper.PropertyMap;

public class CatToCatResponseDtoMapper extends PropertyMap<Cat, CatResponseDto> {

    @Override
    protected void configure() {
        using(new DateToStringConverter()).map(source.getBirth(), destination.getBirth());
    }
}
