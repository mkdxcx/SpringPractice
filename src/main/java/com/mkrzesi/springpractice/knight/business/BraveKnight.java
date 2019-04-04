package com.mkrzesi.springpractice.knight.business;

import com.mkrzesi.springpractice.knight.interfaces.Knight;
import com.mkrzesi.springpractice.knight.interfaces.Quest;

public class BraveKnight implements Knight {

    Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    @Override
    public void knightMakeQuest() {
        quest.makeQuest();
    }
}
