package com.example.hello.controller;

import org.springframework.web.bind.annotation.*;

// 멱등성 충족
// DTO 보다는 쿼리와 PathVariable 을 추천함.

@RestController
@RequestMapping("/api")
public class DeleteApiController {

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account){
        System.out.println(userId);
        System.out.println(account);
    }
}
