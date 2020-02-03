package com.sejin.springbootpractice.dto.res;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CatResponseDto {
    private Long catIdx;
    private String name;
    private String kind;
    private Integer age;
    private String furColor;
}
