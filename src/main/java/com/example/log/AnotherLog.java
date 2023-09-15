package com.example.log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AnotherLog implements SimpleLogger {
    @Override
    public void myLogMethod() {
        log.info("my own, custom another logger");
    }
}
