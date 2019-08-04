package com.sejin.springbootpractice.controller;

import com.sejin.springbootpractice.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data")
public class DataController {
    @Autowired
    private Data data;

    @GetMapping
    public String[] getAllData() {
        return data.getDataList();
    }

    @GetMapping("/{id}")
    public String getData(@PathVariable int id) {
        return data.getData(id);
    }
}
