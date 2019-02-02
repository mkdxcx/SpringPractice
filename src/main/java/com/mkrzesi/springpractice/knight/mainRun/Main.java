package com.mkrzesi.springpractice.knight.mainRun;

import com.mkrzesi.springpractice.SpringpracticeApplication;
import com.mkrzesi.springpractice.knight.BraveKnight;
import com.mkrzesi.springpractice.knight.CowardKnight;
import com.mkrzesi.springpractice.knight.Knight;
import com.mkrzesi.springpractice.knight.aspects.Minstrel;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringpracticeApplication.class, args);
                //new FileSystemXmlApplicationContext("src/main/resources/knight/knights.xml");

        Knight braveKnightOne = context.getBean("braveKnightOne", BraveKnight.class);
        braveKnightOne.makeQuest();

        Knight braveKnightTwo = context.getBean("braveKnightTwo", BraveKnight.class);
        braveKnightTwo.makeQuest();

        Knight cowardKnight = context.getBean("cowardKnight", CowardKnight.class);
        cowardKnight.makeQuest();

    }
}