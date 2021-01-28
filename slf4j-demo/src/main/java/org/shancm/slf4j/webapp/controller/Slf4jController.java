package org.shancm.slf4j.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class Slf4jController {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/record/{message}")
    public void record(@PathVariable("message") String message) {
        logger.info(message);
        logger.error(message);
    }


}
