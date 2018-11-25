package com.mkrzesi.springpractice.knight;

public class CowardKnight implements Knight{

    Quest quest;

    public CowardKnight(Quest quest){
        this.quest = quest;
    }

    @Override
    public void makeQuest() {
        quest.makeQuest();
    }
}
