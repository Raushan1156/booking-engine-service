package com.booking.engine.booking_engine_service;

//import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

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

    @Test
    @DisplayName("Mock Transaction Flow")
    void loggerMethods(){
        String token = UUID.randomUUID().toString().substring(0,7);
        log.trace("[Token:{}] - Entering into a Mock Transaction Flow.", token);

        try {
            String accountType = "Premium";
            int activeAccount = 10;
            double transactionLimitEachDay = 100000.00;
            double currentTransaction = 90000.00;
            log.debug("Current data: {}, {}", currentTransaction, transactionLimitEachDay);
            double leftVolume = transactionLimitEachDay - currentTransaction;
            if (leftVolume <= 11000.50) {
                log.warn("Transaction limit is about to exhaust. Left volume is:{}", leftVolume);
            } else if (leftVolume<=0) {
                throw new RuntimeException("check the left volumn.");
            } else {
                log.info("{} has been deducted.", currentTransaction);
            }
            log.debug("Initial volume was: {},Left volume is: {}", transactionLimitEachDay, leftVolume);
            log.info("Limit / volume has been updated.");
        }
        catch(Exception ex){
            log.error("Limit has been exceeded...");
            }
        finally {
            log.trace("Exiting the volume tracking scope...");
        }

    }
}
