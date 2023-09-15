package com.example.log.dependency.injections;

import com.example.log.Log;
import com.example.log.SimpleLogger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

@Component
public class ConstructorInjection implements CommandLineRunner {

//    Logger logger = LoggerFactory.getLogger(ConstructorInjection.class);

    private final SimpleLogger log;

    public ConstructorInjection(Log log) {
        this.log = log;
    }

    @Override
    public void run(String... args) throws Exception {
//    logger.info("nie znając");
//        log.myLogMethod("This is log from Constructor injection");
        log.myLogMethod();
    }
}

