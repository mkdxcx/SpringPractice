package com.mkrzesi.springpractice.soundsystem.business.player;

import com.mkrzesi.springpractice.soundsystem.Interfaces.Tape;
import com.mkrzesi.springpractice.soundsystem.business.tape.MagneticTape;

public class TapePlayer {

    Tape magneticTape;

    public void setMagneticTape(Tape magneticTape){
        this.magneticTape = magneticTape;
    }

    public void play(){
        magneticTape.play();
    }
}
