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
    public MediaPlayer getMediaPlayerOne(){
        return new CDplayer(getCompactDiscBeatles());
    }

    @Bean(name="Rolling")
    public MediaPlayer getMediaPlayerTwo(){return new CDplayer(getCompactDiscRolling());}

    @Bean(name="cdPlayerThree")
    public MediaPlayer getMediaPlayerThree(CompactDisc cd){
        return new CDplayer(cd);
    }

    @Bean(name="cdPlayerFour")
    public MediaPlayer getMediaPlayerFour(CompactDisc cd){
        MediaPlayer cdPlayer = new CDplayer(cd);
        ((CDplayer) cdPlayer).setCD(cd);
        return cdPlayer;
    }
}
