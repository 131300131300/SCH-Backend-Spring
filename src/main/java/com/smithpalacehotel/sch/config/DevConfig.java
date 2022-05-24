package com.smithpalacehotel.sch.config;

import java.io.IOException;
import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.smithpalacehotel.sch.services._DBService;

@Configuration
@Profile("dev")
public class DevConfig {

    @Autowired
    private _DBService dbService;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String strategy;

    @Bean
    public boolean instatiateDatabase() throws ParseException, IOException {
        System.out.println("Dev");
        if (!"create".equals(strategy)) {
            return false;
        }
        dbService.instantiateTestDatabase();
        return true;
    }

}
