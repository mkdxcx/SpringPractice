package com.mkrzesi.springpractice;

import com.mkrzesi.springpractice.soundsystem.CDplayer;
import com.mkrzesi.springpractice.soundsystem.MediaPlayer;
import com.mkrzesi.springpractice.soundsystem.SgtPeppers;
import com.mkrzesi.springpractice.soundsystem.configuration.CDplayerConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CDplayerConfiguration.class)
public class SpringpracticeApplicationTests {

    @Autowired
    SgtPeppers sgtPeppers;

    @Autowired
    MediaPlayer player;

    @Test
    public void isNotNull() {
        assertNotNull(sgtPeppers);
        assertNotNull(player);
    }

    @Test
    public void doSomething() {
        player = new CDplayer(sgtPeppers);
        player.play();
    }
}
