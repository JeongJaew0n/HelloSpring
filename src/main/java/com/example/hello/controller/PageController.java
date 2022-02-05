package com.example.hello.controller;

import com.example.hello.dto.ResponseUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main() {
        return "main.html";
    }

    //ResponseEntity

    // Not Recommended way but sometimes
    @ResponseBody
    @GetMapping("/user")
    public ResponseUser user() {
        /* var is added in java11 */
        var user = new ResponseUser();
        user.setName("steve");
        user.setAddress("패스트 캠퍼스");
        return user;
    }
}
