package com.example.webanwendung_teil1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class WebanwendungTeil1Application {

    public static void main(String[] args) {
        SpringApplication.run(WebanwendungTeil1Application.class, args);
    }

}
