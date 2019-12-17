package com.cx.springboot004.demo.conf;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@SpringBootTest
public class IOCTest {
    @Test
    public void test001() {
        ApplicationContext ioc =  new AnnotationConfigApplicationContext(MyConf.class);
        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
        for (String beanName:
        beanDefinitionNames) {
            System.out.println(beanName);
        }
    }
}
