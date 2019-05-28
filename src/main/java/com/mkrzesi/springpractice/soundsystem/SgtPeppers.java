package com.mkrzesi.springpractice.soundsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("peppers")
public class SgtPeppers implements CompactDisc {

    Logger logger = LoggerFactory.getLogger(getClass());

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        logger.info("Now playing " + title + "artist: " + artist);
    }
}
