package com.mkrzesi.springpractice.knight;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class KnightTest {

    @Autowired
    @Qualifier("braveKnightOne")
    private BraveKnight braveKnightOne;

    @Autowired
    @Qualifier("braveKnightTwo")
    private BraveKnight braveKnightTwo;

    @Autowired
    private CowardKnight cowardKnight;


    @Test
    public void checkIfDragonIsKilled(){
        braveKnightOne.makeQuest();
    }

    @Test
    public void checkIfDamselIsSave(){
        braveKnightTwo.makeQuest();
    }

    @Test
    public void checkIfCowardKnightIsPassive(){
        cowardKnight.makeQuest();
    }
}
