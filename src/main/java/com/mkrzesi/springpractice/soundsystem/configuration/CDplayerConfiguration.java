package com.mkrzesi.springpractice.soundsystem.configuration;

import com.mkrzesi.springpractice.soundsystem.Interfaces.CompactDisc;
import com.mkrzesi.springpractice.soundsystem.Interfaces.MediaPlayer;
import com.mkrzesi.springpractice.soundsystem.business.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class CDplayerConfiguration {

    @Bean(name = "sgtPeppers")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean(name = "startMeUp")
    public CompactDisc startMeUp(){
        return new StartMeUp();
    }

    @Bean(name = "blankOne")
    public CompactDisc blankDisc(){
        return new BlankDisc("BlankTitle1","BlankArtist1", discography());
    }

    @Bean(name = "discographyOne")
    public List<String> discography(){
        List<String> discography = new ArrayList<>();
        discography.add("Track1Title");
        discography.add("Track2Title");
        discography.add("Track3Title");
        return discography;
    }

    @Bean(name = "cdPlayerWithSgtPeppersBean")
    public MediaPlayer cdPlayerWithSgtPeppers(){return new CDplayer(sgtPeppers()); }

    @Bean(name = "cdPlayerWithStartMeUp")
    public MediaPlayer cdPlayerWithStartMeUp(){return new CDplayer(startMeUp());}

    @Bean(name = "cdPlayerWithBlankDisc")
    public MediaPlayer cdPlayerWithBlankDisc(){return new CDplayer(blankDisc());}
}
