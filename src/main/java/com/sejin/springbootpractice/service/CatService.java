package com.sejin.springbootpractice.service;

import com.sejin.springbootpractice.dto.req.CatRequestDto;
import com.sejin.springbootpractice.dto.res.CatResponseDto;
import com.sejin.springbootpractice.model.Cat;
import com.sejin.springbootpractice.repository.CatRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
public class CatService {
    private final CatRepository catRepository;

    public CatService(final CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public List<Cat> getCatList(CatRequestDto catRequestDto) {
        if (catRequestDto.getKind() != null) {
            return catRepository.findByKind(catRequestDto.getKind());
        }
        return catRepository.findAll();
    }
}
