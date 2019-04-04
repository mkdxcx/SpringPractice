package com.mkrzesi.springpractice.knight.configuration;

import com.mkrzesi.springpractice.knight.business.BraveKnight;
import com.mkrzesi.springpractice.knight.business.CowardKnight;
import com.mkrzesi.springpractice.knight.interfaces.Knight;
import com.mkrzesi.springpractice.knight.aspects.Minstrel;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com\\mkrzesi\\springpractice\\knight\\configuration\\");

        Minstrel minstrel = context.getBean(Minstrel.class);

        Knight braveKnightOne = context.getBean("braveKnightOne",BraveKnight.class);
        braveKnightOne.makeQuest();

        Knight braveKnightTwo = context.getBean("braveKnightTwo",BraveKnight.class);
        braveKnightTwo.makeQuest();

        Knight cowardKnight = context.getBean(CowardKnight.class);
        cowardKnight.makeQuest();
        
        context.close();
    }
}