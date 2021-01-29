package org.shancm.slf4j.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Slf4jController {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

//    @Value("${log4j.appender.info.File}")
//    private String filePath;

//    @Value("${profile.log4j.appender.info.File}")
//    private String path;

//    @Value("${define}")
//    private String value;

    @GetMapping("/record/{message}")
    public void record(@PathVariable("message") String message) {
        logger.info(message);
        logger.error(message);
//        System.out.println(filePath);
//        System.out.println(path);
//        System.out.println(value);

    }


}
