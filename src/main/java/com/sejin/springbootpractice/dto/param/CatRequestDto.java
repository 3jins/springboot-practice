package com.sejin.springbootpractice.dto.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CatRequestDto {
    private String name;
    private String kind;
    private Date birth;
    @JsonProperty("fur_color")
    private String furColor;
}
