package com.sejin.springbootpractice.configuration;

import com.sejin.springbootpractice.dto.mapper.CatToCatResponseDtoMapper;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        final ModelMapper modelMapper = new ModelMapper();
        modelMapper.addMappings(new CatToCatResponseDtoMapper());
        return modelMapper;
    }
}
