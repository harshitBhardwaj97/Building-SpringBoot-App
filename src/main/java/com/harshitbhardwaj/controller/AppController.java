package com.harshitbhardwaj.controller;

import com.harshitbhardwaj.entity.BeanDetails;
import com.harshitbhardwaj.entity.BeanResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AppController {

    private final List<BeanDetails> beanList = new ArrayList<>();
    private int beanCount;

    @GetMapping("/")
    public String helloWorld() {
        return "Hello world !, hit /beans endpoint to see all the beans.";
    }

    @GetMapping("/beans")
    public ResponseEntity<BeanResponse> beans() {
        var beanResponse = new BeanResponse();
        beanResponse.setBeanCount(beanCount);
        beanResponse.setBeans(beanList);
        return ResponseEntity.ok(beanResponse);
    }

    @Bean
    CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("Application is initialized !");
            String[] beans = ctx.getBeanDefinitionNames();
            beanCount = ctx.getBeanDefinitionCount();

            for (var bean : beans) {
                String beanType = ctx.getType(bean).getName();
                var beanDetails = new BeanDetails(bean, beanType);
                System.out.println("Bean: " + bean + ", Type: " + beanType);
                beanList.add(beanDetails);
            }
        };
    }

}
