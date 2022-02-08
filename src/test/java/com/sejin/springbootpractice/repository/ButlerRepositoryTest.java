package com.sejin.springbootpractice.repository;

import com.sejin.springbootpractice.model.Butler;
import com.sejin.springbootpractice.model.Cat;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest
public class ButlerRepositoryTest {
    @Autowired
    private CatRepository catRepository;
    @Autowired
    private ButlerRepository butlerRepository;

    @Test
    public void addCat() {
        final Butler butler = new Butler();
        butler.setName("노예");
        butlerRepository.save(butler);

        final Cat cat = new Cat();
        cat.setName("김애용");
        cat.setFurColor("cream coat");
        cat.setBirth(new Date());
        cat.setKind("korean short hair");
        butler.addCat(cat);
        catRepository.save(cat);
    }
}
