package com.example.hello.controller;

import com.example.hello.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{userId}")
    public PutRequestDto put(@RequestBody PutRequestDto putRequestDto, @PathVariable(name = "userId") Long id) {
        System.out.println(putRequestDto);
        System.out.println("PathVariable: "+id);
        return putRequestDto;   // return 하면 스프링에서 알아서 response 해줌
    }
    @PutMapping("/put")
    public PutRequestDto putTest(PutRequestDto putRequestDto, @RequestParam(name = "userId") Long id) {
        System.out.println(putRequestDto);
        System.out.println("RequestParam: "+id);
        return putRequestDto;   // return 하면 스프링에서 알아서 response 해줌
    }
}
