package com.mkrzesi.springpractice.soundsystem.configuration;

import com.mkrzesi.springpractice.soundsystem.Interfaces.CompactDisc;
import com.mkrzesi.springpractice.soundsystem.Interfaces.MediaPlayer;
import com.mkrzesi.springpractice.soundsystem.Interfaces.Tape;
import com.mkrzesi.springpractice.soundsystem.apect.VolumeController;
import com.mkrzesi.springpractice.soundsystem.business.disc.BlankDisc;
import com.mkrzesi.springpractice.soundsystem.business.disc.SgtPeppers;
import com.mkrzesi.springpractice.soundsystem.business.disc.StartMeUp;
import com.mkrzesi.springpractice.soundsystem.business.player.CDplayer;
import com.mkrzesi.springpractice.soundsystem.business.player.TapePlayer;
import com.mkrzesi.springpractice.soundsystem.business.tape.MagneticTape;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class CDplayerConfiguration {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Bean(name = "discographyOne")
    public List<String> discographyOne(){
        List<String> tracks = new ArrayList<>();
        tracks.add("Blank1Track1");
        tracks.add("Blank1Track2");
        tracks.add("Blank1Track3");
        return tracks;
    }

    //inject by constructor
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
        return new BlankDisc("BlankArtist","BlankTitle", discographyOne());
    }

    @Bean(name = "cdPlayerWithSgtPeppersBean")
    public MediaPlayer cdPlayerWithSgtPeppers(){return new CDplayer(sgtPeppers()); }

    @Bean(name = "cdPlayerWithStartMeUp")
    public MediaPlayer cdPlayerWithStartMeUp(){return new CDplayer(startMeUp());}

    @Bean(name = "cdPlayerWithBlankDisc")
    public MediaPlayer cdPlayerWithBlankDisc(){return new CDplayer(blankDisc());}

    //inject by properties
    @Bean(name = "magneticTape")
    public Tape tape(){
        return new MagneticTape();
    }

    @Bean(name = "tapePlayer")
    public TapePlayer tapePlayer(){
        return new TapePlayer();
    }

/*    //aspect
    @Bean(name = "volumeAspect")
    public VolumeController volumeController(){return new VolumeController();}

    @Pointcut("execution(* *play(..))")
    public void changeVolume(){
        volumeController().volumeUp();
        volumeController().volumeDown();
    }*/
}
