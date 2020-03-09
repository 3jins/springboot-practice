package com.sejin.springbootpractice.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Cat {
    @Id
    @GeneratedValue
    @Column(name = "cat_idx", nullable = false)
    private Long catIdx;

    private String name;

    @Column(nullable = false)
    private String kind;

    @Column(nullable = false)
    private Date birth;

    @Column(name = "fur_color", nullable = false)
    private String furColor;
}
