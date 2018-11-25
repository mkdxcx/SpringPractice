package com.mkrzesi.springpractice.knight.configuration;

import com.mkrzesi.springpractice.knight.BraveKnight;
import com.mkrzesi.springpractice.knight.CowardKnight;
import com.mkrzesi.springpractice.knight.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com\\mkrzesi\\springpractice\\knight\\configuration\\");
        Knight braveKnight = context.getBean(BraveKnight.class);
        braveKnight.makeQuest();

        Knight cowardKnight = context.getBean(CowardKnight.class);
        cowardKnight.makeQuest();
    }
}