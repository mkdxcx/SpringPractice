package com.mkrzesi.springpractice.knight.business;

import com.mkrzesi.springpractice.knight.interfaces.Quest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KillDragonQuest implements Quest {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void makeQuest() {
        logger.info("Kill the dragon!!!");
    }
}