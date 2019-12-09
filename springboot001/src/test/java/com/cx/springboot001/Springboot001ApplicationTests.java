package com.cx.springboot001;

import com.cx.springboot001.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Springboot001ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private Person person;

    @Autowired
    private ApplicationContext ioc;

    @Test
    public void testConfiguration() {
        System.out.println(person);
    }

    @Test
    public void testHelloService() {
        boolean helloWorldService = ioc.containsBean("helloWorldService");
        System.out.println(helloWorldService);
    }

}
