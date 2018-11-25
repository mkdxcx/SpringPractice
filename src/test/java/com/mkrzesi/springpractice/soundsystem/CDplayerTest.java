package com.mkrzesi.springpractice.soundsystem;


import com.mkrzesi.springpractice.soundsystem.configuration.CDplayerConfiguration;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDplayerConfiguration.class )
public class CDplayerTest {

   Logger logger = LoggerFactory.getLogger(getClass());

}

