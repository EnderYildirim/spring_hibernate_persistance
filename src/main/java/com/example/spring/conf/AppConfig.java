package com.example.spring.conf;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.spring.dao.CustomerDAOImpl;

@Configuration
public class AppConfig {

    @Bean("customerDao")
    public CustomerDAOImpl customerDao(SessionFactory sessionFactory) {
        return new CustomerDAOImpl(sessionFactory);
    }
    
}
