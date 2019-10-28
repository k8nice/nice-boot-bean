package com.nice;

import com.nice.config.AppConfig;
import com.nice.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ningh
 */
public class IocTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = context.getBean(User.class);
        System.out.println(user);
    }

}
