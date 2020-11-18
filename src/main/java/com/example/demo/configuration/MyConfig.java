package com.example.demo.configuration;

import com.example.demo.entity.Person;
import com.example.demo.filter.MyTypeFilter;
import org.springframework.context.annotation.*;

@ComponentScan(value = "com.example.demo",
//        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Service.class}),
        includeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class}),
        useDefaultFilters = false)

@Scope("prototype")
@Configuration
public class MyConfig {
    @Bean
    public Person person(){
      return new Person("xujj", 18);
    }
}
