package com.mkrzesi.springpractice.knight.aspects;

import com.mkrzesi.springpractice.knight.interfaces.Minstrel;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class MinstrelAspect implements Minstrel {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Pointcut("execution(* com.mkrzesi.springpractice.knight.business.*.makeQuest())")
    private void sing(){}

    @Before("sing()")
    public void singBeforeQuestAdvice(){
        logger.info("Minstrel is singing BEFORE quest");
    }

    @After("sing()")
    public void singAfterQuestAdvice(){
        logger.info("Minstrel is singing AFTER quest");
    }
}
