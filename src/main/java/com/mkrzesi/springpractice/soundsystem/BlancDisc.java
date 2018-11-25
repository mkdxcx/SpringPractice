/*
package com.mkrzesi.springpractice.soundsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class BlancDisc implements CompactDisc {

    Logger logger = LoggerFactory.getLogger(getClass());

    private String title;
    private String artist;
    private List<String> songList;

    public BlancDisc(String title, String artist, List<String> songList) {
        this.title = title;
        this.artist = artist;
        this.songList = songList;
    }

    @Override
    public void play() {
        int i = 0;
        logger.info("Now playing " + this.title + "artist: " + this.artist);
        for (String track : this.songList) {
            logger.info("Song no " + i + ": " + track);
            i++;
        }
    }
}
*/
