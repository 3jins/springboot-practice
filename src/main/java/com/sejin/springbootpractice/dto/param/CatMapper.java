package com.sejin.springbootpractice.dto.param;

import com.sejin.springbootpractice.dto.converter.DateToStringConverter;
import com.sejin.springbootpractice.dto.mapper.CatToCatResponseDtoMapper;
import org.modelmapper.ModelMapper;

public class CatMapper {
    private ModelMapper modelMapper;

    public CatMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        modelMapper.addMappings(new CatToCatResponseDtoMapper());
    }
}
