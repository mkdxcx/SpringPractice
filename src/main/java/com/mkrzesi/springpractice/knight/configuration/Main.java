package com.mkrzesi.springpractice.knight.configuration;

import com.mkrzesi.springpractice.knight.aspects.MinstrelAspect;
import com.mkrzesi.springpractice.knight.business.BraveKnight;
import com.mkrzesi.springpractice.knight.business.CowardKnight;
import com.mkrzesi.springpractice.knight.interfaces.Knight;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com\\mkrzesi\\springpractice\\knight\\configuration\\");

        MinstrelAspect minstrelAspect = context.getBean(MinstrelAspect.class);

        Knight braveKnightOne = context.getBean("braveKnightOne",BraveKnight.class);
        Knight braveKnightTwo = context.getBean("braveKnightTwo",BraveKnight.class);
        Knight cowardKnight = context.getBean("cowardKnight",CowardKnight.class);

        braveKnightOne.makeQuest();
        braveKnightTwo.makeQuest();
        cowardKnight.makeQuest();

        context.close();
    }
}