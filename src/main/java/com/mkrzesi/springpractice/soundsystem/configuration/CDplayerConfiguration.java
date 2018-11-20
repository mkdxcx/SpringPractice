package com.mkrzesi.springpractice.soundsystem.configuration;

import com.mkrzesi.springpractice.soundsystem.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDplayerConfiguration {

    //Beans for CompactDiscs

    @Bean(name="sgtPeppers")
    public CompactDisc getCompactDiscBeatles(){
        return new SgtPeppers();
    }

    @Bean(name="startMeUp")
    public CompactDisc getCompactDiscRolling(){
        return new StartMeUp();
    }

    //Beans for cdPlayers

    @Bean(name="cdPlayerOne")
    public MediaPlayer getMediaPlayer(){
        return new CDplayer(getCompactDiscBeatles());
    }

    @Bean(name="cdPlayerTwo")
    public MediaPlayer getMediaPlayerTwo(CompactDisc cd){
        return new CDplayer(cd);
    }

    @Bean(name="cdPlayerThree")
    public MediaPlayer getMediaPlayerThree(CompactDisc cd){
        MediaPlayer cdPlayer = new CDplayer(cd);
        ((CDplayer) cdPlayer).setCD(cd);
        return cdPlayer;
    }
}
