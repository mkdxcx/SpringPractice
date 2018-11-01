package com.mkrzesi.springpractice.springpractice.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

public class CDplayer implements MediaPlayer{

    CompactDisc cd;

    @Autowired
    public CDplayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play(){
        cd.play();
    }
}
