package com.sejin.springbootpractice.dto.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class GetCatListRequestDto {
    private String name;
    private String kind;
    private Date birth;
    private String furColor;
}
