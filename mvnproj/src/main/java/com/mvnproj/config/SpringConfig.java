package com.mvnproj.config;

import com.mvnproj.service.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
 
    @Bean
    public TestBean getTestBean(){
        return new TestBean("hello");
    }
}
