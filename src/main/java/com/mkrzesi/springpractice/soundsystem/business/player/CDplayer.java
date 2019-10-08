package com.mkrzesi.springpractice.soundsystem.business.player;

import com.mkrzesi.springpractice.soundsystem.Interfaces.CompactDisc;
import com.mkrzesi.springpractice.soundsystem.Interfaces.MediaPlayer;

public class CDplayer implements MediaPlayer {

    private CompactDisc cd;

    public CDplayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() { cd.playCd(); }
}
