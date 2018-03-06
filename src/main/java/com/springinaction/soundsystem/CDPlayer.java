package com.springinaction.soundsystem;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    @Inject
    public CDPlayer(CompactDisc compactDisc){
        this.compactDisc = compactDisc;
    }

    public void play() {
        compactDisc.play();
    }
}
