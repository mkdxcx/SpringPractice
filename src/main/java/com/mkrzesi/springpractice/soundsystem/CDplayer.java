package com.mkrzesi.springpractice.soundsystem;

public class CDplayer implements MediaPlayer {

    private CompactDisc cd;


    public CDplayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void setCD(CompactDisc cd){
        this.cd = cd;
    }

    public void play() { cd.play(); }
}
