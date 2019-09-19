package com.mkrzesi.springpractice.soundsystem.configuration;

import com.mkrzesi.springpractice.soundsystem.Interfaces.Tape;
import com.mkrzesi.springpractice.soundsystem.business.disc.BlankDisc;
import com.mkrzesi.springpractice.soundsystem.business.player.CDplayer;
import com.mkrzesi.springpractice.soundsystem.business.player.TapePlayer;
import com.mkrzesi.springpractice.soundsystem.business.tape.MagneticTape;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com\\mkrzesi\\springpractice\\soundsystem\\configuration\\");

        CDplayer cdPlayerOne = context.getBean("cdPlayerWithSgtPeppersBean", CDplayer.class);
        CDplayer cdPlayerTwo = context.getBean("cdPlayerWithStartMeUp", CDplayer.class);
        //BlankDisc cdPlayerThree = context.getBean("cdPlayerWithBlankDisc", BlankDisc.class);
        //cdPlayerOne.play();
        //cdPlayerTwo.play();
        //cdPlayerThree.play();

        MagneticTape magneticTape = context.getBean("magneticTape", MagneticTape.class);
        magneticTape.setArtist("magnetoArtist");
        magneticTape.setTitle("magnetoTitle");
        TapePlayer tapePlayer = context.getBean("tapePlayer", TapePlayer.class);
        tapePlayer.setMagneticTape(magneticTape);
        tapePlayer.play();


    }
}
