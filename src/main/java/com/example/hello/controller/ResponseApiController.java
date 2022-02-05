package com.example.hello.controller;


import com.example.hello.dto.ResponseUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/response")
public class ResponseApiController {

    // Text
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    // Json
    // req -> object mapper -> object -> method -> object -> object mapper -> json -> response
    @PostMapping("/json")
    public ResponseUser json(@RequestBody ResponseUser user) {
        return user;
    }

    // Custom for Response. Recommended way
    // ResponseEntity
    @PutMapping("/put")
    public ResponseEntity<ResponseUser> put(@RequestBody ResponseUser user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
