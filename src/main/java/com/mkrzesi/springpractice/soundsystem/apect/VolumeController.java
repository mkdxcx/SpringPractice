package com.mkrzesi.springpractice.soundsystem.apect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class VolumeController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Before("execution(* play(..))")
    public void volumeUp(){
        logger.info("Volume Controller - Volume UP");
    }

    @After("execution(* play(..))")
    public void volumeDown(){
        logger.info("Volume Controller - Volume DOWN");
    }
}
