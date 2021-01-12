package com.zongze.deploy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2020/11/5 10:09
 * @Created by xzz
 */
@RestController
public class TestDeployController {

    private static Logger logger = LoggerFactory.getLogger(Object.class);


    @Value("${deploy.environment.name}")
    private String environment;

    @GetMapping("test")
    public String deploy() {
        return environment;
    }


    @GetMapping("log")
    public void log() {
        logger.trace("=====trace======");
        logger.debug("=====debug======");
        logger.info("=====info======");
        logger.warn("=====warn======");
        logger.error("=====error======");
    }


}
