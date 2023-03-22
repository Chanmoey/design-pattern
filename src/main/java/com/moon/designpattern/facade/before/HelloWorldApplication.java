package com.moon.designpattern.facade.before;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Chanmoey
 * @date 2023年03月22日
 */
@SpringBootApplication
@Configuration
//@ConfigurationPropertiesScan(basePackages = {"com.moon.designpattern"})
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

}
