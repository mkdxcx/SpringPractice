package com.mkrzesi.springpractice.soundsystem.configuration;

import com.mkrzesi.springpractice.soundsystem.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDplayerConfiguration {

    @Bean
    public CompactDisc sgtPeppers(){return new SgtPeppers();}

    //@Bean
    //public CompactDisc startMeUp(){return new StartMeUp();}

    @Bean
    public CDplayer cdPlayerOne(){return new CDplayer(sgtPeppers());}

    //@Bean
    //public CDplayer cdPlayerTwo(){return new CDplayer(startMeUp());}
}
