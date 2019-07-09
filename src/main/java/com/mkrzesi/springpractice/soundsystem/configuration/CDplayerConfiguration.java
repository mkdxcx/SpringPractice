package com.mkrzesi.springpractice.soundsystem.configuration;

import com.mkrzesi.springpractice.soundsystem.*;
import com.mkrzesi.springpractice.soundsystem.Interfaces.CompactDisc;
import com.mkrzesi.springpractice.soundsystem.Interfaces.MediaPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

    @Bean(name = "cdPlayerWithSgtPeppersBean")
    public MediaPlayer cdPlayerWithSgtPeppers(){return new CDplayer(sgtPeppers()); }

    @Bean(name = "cdPlayerWithStartMeUpBean")
    public MediaPlayer cdPlayerWithStartMeUp(){return new CDplayer(startMeUp());}
}
