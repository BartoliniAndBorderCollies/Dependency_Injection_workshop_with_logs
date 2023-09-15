package com.example.log.config;

import com.example.log.AnotherLog;
import com.example.log.SimpleLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class LoggerConfig {
    @Bean
    @Primary
    public SimpleLogger classLogger() {
        return new AnotherLog();
    }
}
