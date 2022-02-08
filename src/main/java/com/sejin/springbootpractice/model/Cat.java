package com.sejin.springbootpractice.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Cat {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(nullable = false)
    private String kind;

    @Column(nullable = false)
    private Date birth;

    @Column(name = "fur_color", nullable = false)
    private String furColor;

    @ManyToOne
    private Butler butler;
}
