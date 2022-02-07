package com.example.hello;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ioc_Main {
    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        // Base 64 encoding
//        IEncoder encoder = new Base64Encoder();
//        System.out.println(encoder.encode(url));

        // 객체가 직접 생성해서 가지고 있기.
//        Encoder encoder = new Encoder();

        // DI (의존성 주입)
        Encoder encoder = new Encoder(new Base64Encoder()); // 골라서 쓰세요!
        String result = encoder.encode(url);        
        System.out.println(result);
    // It looks like subStream of file input output.
        
        
        // Url encoding
//        IEncoder urlEncoder = new UrlEncoder();
//        System.out.println(urlEncoder.encode(url));

    }
}
