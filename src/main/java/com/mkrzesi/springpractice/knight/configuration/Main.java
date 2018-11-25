package com.mkrzesi.springpractice.knight.configuration;

import com.mkrzesi.springpractice.knight.BraveKnight;
import com.mkrzesi.springpractice.knight.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com\\mkrzesi\\knight\\configuration\\");
        Knight knight = context.getBean(BraveKnight.class);
        knight.makeQuest();
    }
}