package com.mkrzesi.springpractice.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDplayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CDplayer(@Qualifier("peppers") CompactDisc cd) {
        this.cd = cd;
    }

    public void play() { cd.play(); }
}

