package com.mkrzesi.knight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BraveKnight implements Knight{

    Logger logger = LoggerFactory.getLogger(getClass());
    Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    @Override
    public void makeQuest() {
        quest.makeQuest();
    }
}
