package com.sejin.springbootpractice.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
    private Integer age;

    @Column(name = "fur_color", nullable = false)
    private String furColor;
}
