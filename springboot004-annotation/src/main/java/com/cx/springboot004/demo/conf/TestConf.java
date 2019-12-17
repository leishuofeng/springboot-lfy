package com.cx.springboot004.demo.conf;

import com.cx.springboot004.demo.domain.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConf {

    public static void main(String[] args) {
        /*// 创建容器，使用配置类作为参数
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConf.class);
        Person person = context.getBean(Person.class);
        System.out.println(person);*/

        ApplicationContext ioc =  new AnnotationConfigApplicationContext(MyConf.class);
        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
        for (String beanName:
                beanDefinitionNames) {
            System.out.println(beanName);
        }
    }
}
