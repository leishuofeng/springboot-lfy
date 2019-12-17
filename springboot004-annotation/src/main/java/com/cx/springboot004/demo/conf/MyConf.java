package com.cx.springboot004.demo.conf;

import com.cx.springboot004.demo.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @Configuratioin 告诉spring这是一个配置类
 *
 * @Bean 给容器中注册一个Bean 默认类型为返回值类型，名称为方法名称
 */

@Configuration
@ComponentScan(value="com.cx")
// @ComponentScan(value = "com.cx",excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})},useDefaultFilters = false)
// @ComponentScan(value = "com.cx",includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})},useDefaultFilters = false)
public class MyConf {

    @Bean
    Person person(){
        return new Person("张三",18);
    }
}
