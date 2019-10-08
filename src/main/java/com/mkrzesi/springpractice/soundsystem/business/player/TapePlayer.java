package com.mkrzesi.springpractice.soundsystem.business.player;

import com.mkrzesi.springpractice.soundsystem.Interfaces.Tape;

public class TapePlayer {

    Tape magneticTape;

    public void setMagneticTape(Tape magneticTape) {
        this.magneticTape = magneticTape;
    }

    public void play() {
        magneticTape.play();
    }
}
