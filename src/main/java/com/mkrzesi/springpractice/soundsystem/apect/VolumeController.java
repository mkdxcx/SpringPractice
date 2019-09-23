package com.mkrzesi.springpractice.soundsystem.apect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class VolumeController {

    Logger logger = LoggerFactory.getLogger(getClass());

    public void volumeUp(){
        logger.info("Volume Controller - Volume UP");
    }

    public void volumeDown(){
        logger.info("Volume Controller - Volume DOWN");
    }
}
