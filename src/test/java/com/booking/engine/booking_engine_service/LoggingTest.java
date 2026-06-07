package com.booking.engine.booking_engine_service;

//import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
//@Slf4j
public class LoggingTest {
    public static final Logger log = LoggerFactory.getLogger(LoggingTest.class);

    @Test
    @DisplayName("Addition Test")
    public void add(){
        int a=5;
        int b=10;
        log.info("Adding two values: {}, {}", a,b);
        int result = a+b;
        log.info("{}+{}={}",a,b,result);
    }

    @Test
    @DisplayName("Debug level log test")
    void debugTest(){
        log.info("This is INFO level.");
        log.warn("This is WARN level.");
        log.error("This is ERROR level.");
        log.debug("This is DEBUG level.");
        log.trace("This is TRACE level.");
    }
}
