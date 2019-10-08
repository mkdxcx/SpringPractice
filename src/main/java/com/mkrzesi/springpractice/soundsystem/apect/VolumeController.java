package com.mkrzesi.springpractice.soundsystem.apect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class VolumeController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Pointcut("execution(* com.mkrzesi.springpractice.soundsystem.business.player.*.play())")
    public void changeVolume(){}

    @Before("changeVolume()")
    public void volumeUp(){
        logger.info("Volume Controller - Volume UP");
    }

    @After("changeVolume()")
    public void volumeDown(){
        logger.info("Volume Controller - Volume DOWN");
    }
}
