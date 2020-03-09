package com.sejin.springbootpractice.controller;

import com.sejin.springbootpractice.dto.param.CatRequestDto;
import com.sejin.springbootpractice.dto.res.CatResponseDto;
import com.sejin.springbootpractice.model.Cat;
import com.sejin.springbootpractice.service.CatService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/cats")
public class CatController {

    @Autowired
    private CatService catService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/")
    public List<CatResponseDto> getCatList(final String kind) {
        final CatRequestDto catRequestDto = CatRequestDto.builder()
                .kind(kind)
                .build();
        final List<Cat> catList = catService.getCatList(catRequestDto);
        List<CatResponseDto> hi = catList.stream()
                .map(cat -> modelMapper.map(cat, CatResponseDto.class))
                .collect(Collectors.toList());
        return hi;
    }
}
