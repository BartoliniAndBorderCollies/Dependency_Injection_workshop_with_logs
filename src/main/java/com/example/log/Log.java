package com.example.log;


import com.example.log.dependency.injections.ConstructorInjection;
import com.example.log.dependency.injections.FieldInjection;
import com.example.log.dependency.injections.SetterInjection;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Log implements SimpleLogger {

//
//    @Override
//    public void run(String... args) throws Exception {
//        log.info("zrobić");
//    }

    @Override
    public void myLogMethod() {
        log.info("my default info log");
    }

    public void myLogMethod(String... args) {
        for (String arg : args) {
            log.info(arg);
        }
    }
}
