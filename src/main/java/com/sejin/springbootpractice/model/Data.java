package com.sejin.springbootpractice.model;

import org.springframework.stereotype.Component;

@Component
public class Data {
    private String[] dataList = {
            "scottish fold",
            "ragdoll",
            "munchkin",
            "korean short hair",
            "russian blue",
    };

    public String[] getDataList() {
        return dataList;
    }

    public String getData(int id) {
        return dataList[id];
    }

    public void setDataList(String[] dataList) {
        this.dataList = dataList;
    }
}
