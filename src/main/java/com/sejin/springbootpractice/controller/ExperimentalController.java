package com.sejin.springbootpractice.controller;

import com.sejin.springbootpractice.dto.req.ExperimentalRequestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experimental")
public class ExperimentalController {

    @GetMapping("/reqbody")
    public String getRequestBodyValueWithGET(@RequestBody ExperimentalRequestDto request) {
        // It is possible to receive @RequestBody parameters in GET method
        return "value from @RequestBody: " + request.getValue();
    }
}
