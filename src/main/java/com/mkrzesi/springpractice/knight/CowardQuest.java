package com.mkrzesi.springpractice.knight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CowardQuest implements Quest {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void makeQuest() {
        logger.info("Coward knight does nothing!!!!");
    }
}
