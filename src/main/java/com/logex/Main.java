package com.logex;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//@Log4j
public class Main {
    private static final Logger logger =Logger.getLogger(Main.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("src/main/resources/log4j.properties");
        logger.info("TestInfo");
        logger.warn("TestWarn");
        logger.error("TestError");
    }
}
