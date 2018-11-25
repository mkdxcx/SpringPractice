package com.mkrzesi.springpractice.soundsystem.configuration;

import com.mkrzesi.springpractice.soundsystem.CompactDisc;
import com.mkrzesi.springpractice.soundsystem.SgtPeppers;
import com.mkrzesi.springpractice.soundsystem.StartMeUp;
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
}
