package com.mkrzesi.springpractice.soundsystem.configuration;

import com.mkrzesi.springpractice.soundsystem.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDplayerConfiguration {

    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean
    public CompactDisc startMeUp(){
        return new StartMeUp();
    }

    @Bean
    public MediaPlayer cdPlayerWithSgtPeppers(){return new CDplayer(sgtPeppers()); }

    @Bean
    public MediaPlayer cdPlayerWithStartMeUp(){return new CDplayer(startMeUp());}
}
