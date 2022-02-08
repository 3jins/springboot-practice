package com.sejin.springbootpractice.repository;

import com.sejin.springbootpractice.model.Butler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ButlerRepository extends JpaRepository<Butler, Long> {
}
