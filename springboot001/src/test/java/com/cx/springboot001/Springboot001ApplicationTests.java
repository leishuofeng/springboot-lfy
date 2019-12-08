package com.cx.springboot001;

import com.cx.springboot001.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot001ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private Person person;

    @Test
    public void testConfiguration() {
        System.out.println(person);
    }

}
