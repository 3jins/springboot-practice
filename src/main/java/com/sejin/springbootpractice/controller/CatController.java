package com.sejin.springbootpractice.controller;

import com.sejin.springbootpractice.dto.req.CatRequestDto;
import com.sejin.springbootpractice.dto.res.CatResponseDto;
import com.sejin.springbootpractice.model.Cat;
import com.sejin.springbootpractice.service.CatService;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Log4j2
@RestController
@RequestMapping("/api/cats")
public class CatController {

    @Autowired
    private CatService catService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/")
    public List<CatResponseDto> getCatList(String kind) {
        CatRequestDto catRequestDto = CatRequestDto.builder()
                .kind(kind)
                .build();
        List<Cat> catList = catService.getCatList(catRequestDto);
        return catList.stream()
                .map(cat -> modelMapper.map(cat, CatResponseDto.class))
                .collect(Collectors.toList());
    }
}
