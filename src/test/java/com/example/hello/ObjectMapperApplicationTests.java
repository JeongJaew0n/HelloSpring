package com.example.hello;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("-------------");

        // Text Json -> Object
        // Object -> Text Json

        // controller req json(text) -> object
        // response object -> json(text)

        var objectMapper = new ObjectMapper();

        // object -> text(json)
        // *object mapper needs 'get method'
        var user = new User("boongboong",22,"0101-1494-3736");

        var text = objectMapper.writeValueAsString(user);
        System.out.println(text);

        // text(json) -> object
        // *object mapper needs 'default constructor'
        var objectUser = objectMapper.readValue(text, User.class);
        System.out.println(objectUser);
    }

}
