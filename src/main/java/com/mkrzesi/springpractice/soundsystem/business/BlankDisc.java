package com.mkrzesi.springpractice.soundsystem.business;

import com.mkrzesi.springpractice.soundsystem.Interfaces.CompactDisc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class BlankDisc implements CompactDisc {

    Logger logger = LoggerFactory.getLogger(getClass());

    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title, String artist, List<String> tracks){
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void play(){
        logger.info("Now playing: " + artist + ", title: " + title);
        for (String track : tracks){
            logger.info("Track: " + track);
        }
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

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }
}
