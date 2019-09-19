package com.mkrzesi.springpractice.soundsystem.business.tape;

import com.mkrzesi.springpractice.soundsystem.Interfaces.Tape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagneticTape implements Tape {

    Logger logger = LoggerFactory.getLogger(getClass());

    private String title;
    private String artist;

    @Override
    public void play() {
        logger.info("Now playing magnetic tape " + title + ", " + artist);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
