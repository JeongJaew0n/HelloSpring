package com.example.hello.controller;

import com.example.hello.dto.PostRequestDto;
import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api")
public class PostApiController {

    @PostMapping("/old/post")
    public void post(@RequestBody Map<String, Object> requestData) {
//        requestData.entrySet().forEach(stringObjectEntry -> {
//            System.out.println("key: " + stringObjectEntry.getKey());
//            System.out.println("value: " + stringObjectEntry.getValue());
            requestData.forEach((key, value) -> {
                System.out.println("key: " + key);
                System.out.println("value: " + value);
            });
    }

    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto requestDto) {
        System.out.println(requestDto);
    }
}
