package com.sejin.springbootpractice.repository;

import com.sejin.springbootpractice.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CatRepository extends JpaRepository<Cat, Long> {
    public List<Cat> findByKind(String kind);
}
