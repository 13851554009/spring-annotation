package com.example.demo.configuration;

import com.example.demo.filter.MyTypeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@ComponentScan(value = "com.example.demo",
//        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Service.class}),
        includeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class}),
        useDefaultFilters = false)
@Configuration
public class MyConfig1 {

}
