package com.mkrzesi.springpractice.soundsystem.business.disc;

import com.mkrzesi.springpractice.soundsystem.Interfaces.CompactDisc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SgtPeppers implements CompactDisc {

    Logger logger = LoggerFactory.getLogger(getClass());

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        logger.info("Now playing " + title + "artist: " + artist);
    }
}
