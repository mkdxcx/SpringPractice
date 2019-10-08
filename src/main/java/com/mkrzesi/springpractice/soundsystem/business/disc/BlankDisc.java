package com.mkrzesi.springpractice.soundsystem.business.disc;

import com.mkrzesi.springpractice.soundsystem.Interfaces.CompactDisc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BlankDisc implements CompactDisc {

    Logger logger = LoggerFactory.getLogger(getClass());

    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String artist, String title, List<String> tracks){
        this.artist = artist;
        this.title = title;
        this.tracks = tracks;
    }

    public void play() {
        logger.info("Now playing: " + artist + ", title: " + title);

        if (tracks != null) {
            logger.info("Number of tracks: " + tracks.size());
            for (String track : tracks) {
                logger.info("Track: " + track);
            }
        } else {
            logger.info("List of tracks is empty");
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
