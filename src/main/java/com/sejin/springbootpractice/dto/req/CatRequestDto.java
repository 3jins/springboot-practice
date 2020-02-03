package com.sejin.springbootpractice.dto.req;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CatRequestDto {
    private String name;
    private String kind;
    private Integer age;
    @JsonProperty("fur_color")
    private String furColor;
}
