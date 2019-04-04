package com.mkrzesi.springpractice.knight.business;

import com.mkrzesi.springpractice.knight.interfaces.Knight;
import com.mkrzesi.springpractice.knight.interfaces.Quest;

public class CowardKnight implements Knight {

    Quest quest;

    public CowardKnight(Quest quest){
        this.quest = quest;
    }

    @Override
    public void makeQuest() {
        quest.makeQuest();
    }
}
