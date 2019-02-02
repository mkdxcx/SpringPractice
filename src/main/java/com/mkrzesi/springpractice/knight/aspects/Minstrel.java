package com.mkrzesi.springpractice.knight.aspects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Minstrel {

    private static final Logger logger = LoggerFactory.getLogger(Minstrel.class);

    public void singBeforeQuest(){
        logger.info("Minstrel is singing BEFORE quest");
    }

    public void singAfterQuest(){
        logger.info("Minstrel is singing AFTER quest");
    }
}
