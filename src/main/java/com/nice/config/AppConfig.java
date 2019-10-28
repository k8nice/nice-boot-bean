package com.nice.config;

import com.nice.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ningh
 */
@Configuration
public class AppConfig {

    @Bean(name = "user")
    public User initUser(){
        User user = new User();
        user.setId(1L);
        user.setUserNme("nice");
        user.setNote("note_1");
        return user;
    }

}
