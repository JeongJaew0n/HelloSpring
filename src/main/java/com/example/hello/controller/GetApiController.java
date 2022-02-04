package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    // 디폴트는 value 값.
    @GetMapping(path = "/hello")    // http://localhost:portnumber/api/hello
    public String getHello() {
        return "get Helloooo";
    }

//    @RequestMapping("/hi")  // 이렇게 사용할 경우 모든 메소드(get post put delete)에 반응함
    @RequestMapping(path = "/hi/{name}", method = RequestMethod.GET)   // get http://localhost:portnumber/api/hi
    public String hi(@PathVariable(name = "name") String myVariable) {
        return "hi" + myVariable;
    }

    // http://localhost:9090/api/get/path-variable/{name}
    @GetMapping("/path-variable/{name}")   // 경로에 대문자 안씀!!! 바뀌는 부분에는  {}
//    public String pathVariable(@PathVariable String kk) {
            public String pathVariable(@PathVariable(name = "name") String kk) {

        System.out.println("PathVariable: " + kk);

        return kk;
    }

    // 이제 쿼리 파라미터해볼거임
    // http://localhost:9090/api/get/query-param?user=jaewon&mail=jaewons@gmail.com&age=27
    // 데이터의 형태가 key - value
    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append((entry.getKey() + " = " + entry.getValue() + "\n"));

        });

        return sb.toString();
    }

    @GetMapping("query-param02")
    public String queryParam02(@RequestParam String name,
                               @RequestParam String email,
                               @RequestParam int age) {

        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        return name+" "+email+""+age;
    }

    /* 가장 추천하고 많이 쓰는 방법 하지만 미리 정의되지 않은 유저 리퀘스트는 처리 하지 못함*/
    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest) {

        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());
        return userRequest.toString();
    }
}
