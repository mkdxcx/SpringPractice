package com.mkrzesi.springpractice.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDplayerConfiguration.class)
public class CDplayerTest {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private CompactDisc cd;
    @Autowired
    private MediaPlayer mp;

    @Test
    public void cdShouldNotBeNull() {
        cd.play();
        assertNotNull(cd);
    }

    @Test
    public void checkCDplayer(){
        logger.info(mp.getClass().toString());
    }
}