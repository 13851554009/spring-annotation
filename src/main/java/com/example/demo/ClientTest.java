package com.example.demo;

import com.example.demo.configuration.MyConfig1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

public class ClientTest {

    @Test
    public void configurationTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig1.class);
        String [] names = context.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
