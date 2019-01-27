package com.mkrzesi.springpractice.knight;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class Minstrel {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Before("execution(public void makeQuest())")
    public void singBeforeQuest(){
        logger.info("Minstrel is singing BEFORE quest");
    }

    public void singAfterQuest(){
        logger.info("Minstrel is singing AFTER quest");
    }
}
