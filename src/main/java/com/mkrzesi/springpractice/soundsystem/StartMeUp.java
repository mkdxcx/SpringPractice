package com.mkrzesi.springpractice.soundsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@Component("StartMeUp")
public class StartMeUp implements CompactDisc {

    Logger logger = LoggerFactory.getLogger(getClass());

    private String title = "Start me up";
    private String artist = "The Rolling Stones";

    public void play() {
        logger.info("Now playing " + title + "artist: " + artist);
    }
}
