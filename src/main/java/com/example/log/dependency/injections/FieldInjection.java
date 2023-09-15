package com.example.log.dependency.injections;

import com.example.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FieldInjection implements CommandLineRunner {
    @Autowired
    private Log log;

    @Override
    public void run(String... args) throws Exception {
        log.myLogMethod("to jest log z field injection");

    }
}
