package com.mkrzesi.springpractice.knight;

public class BraveKnight implements Knight{

    Quest quest;


    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    @Override
    public void makeQuest() {
        quest.makeQuest();
    }
}
