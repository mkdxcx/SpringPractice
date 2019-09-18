package com.mkrzesi.springpractice.soundsystem.configuration;

import com.mkrzesi.springpractice.soundsystem.business.CDplayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com\\mkrzesi\\springpractice\\soundsystem\\configuration\\");

        CDplayer cdPlayerOne = context.getBean("cdPlayerWithSgtPeppersBean", CDplayer.class);
        CDplayer cDplayerTwo = context.getBean("cdPlayerWithStartMeUp", CDplayer.class);

        cdPlayerOne.play();
        cDplayerTwo.play();
    }


}
