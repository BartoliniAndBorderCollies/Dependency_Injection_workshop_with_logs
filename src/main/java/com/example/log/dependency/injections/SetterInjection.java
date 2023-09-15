package com.example.log.dependency.injections;

import com.example.log.Log;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SetterInjection implements CommandLineRunner {
//    private static final Logger logger = LoggerFactory.getLogger(SetterInjection.class);
    private Log log;

    public void setLog(Log log) {
        this.log = log;
    }

    @Override
    public void run(String... args) throws Exception {
         Log log1 = new Log();
            log1.myLogMethod("to jest log z setter injection");

    }



}
