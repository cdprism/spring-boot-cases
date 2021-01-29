package org.shancm.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Slf4jDemoApplication {

    protected final static Logger logger = LoggerFactory.getLogger(Slf4jDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(Slf4jDemoApplication.class, args);

        logger.info("info");
        logger.error("error");
    }

}
