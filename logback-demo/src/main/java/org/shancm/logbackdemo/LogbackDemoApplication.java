package org.shancm.logbackdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogbackDemoApplication {

    static Logger logger = LoggerFactory.getLogger(LogbackDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LogbackDemoApplication.class, args);
        logger.info("info");
        logger.error("error");
    }

}
