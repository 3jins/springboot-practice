package com.sejin.springbootpractice.dto.res;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CatResponseDto {
    private Long catIdx;
    private String name;
    private String kind;
    private String birth;
    private String furColor;
}
