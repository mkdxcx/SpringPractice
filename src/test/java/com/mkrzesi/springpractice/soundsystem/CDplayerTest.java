package com.mkrzesi.springpractice.soundsystem;


import com.mkrzesi.springpractice.soundsystem.configuration.CDplayerConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDplayerConfiguration.class )
public class CDplayerTest {

   Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MediaPlayer mp;
    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        cd.play();
        if(cd!=null){
            logger.info("cd object is not null");
        }
        assertNotNull(cd);
    }

    @Test
    public void checkCDplayer(){
        mp.play();
    }
}

