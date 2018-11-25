package com.mkrzesi.springpractice.knight;

import com.mkrzesi.knight.BraveKnight;
import com.mkrzesi.knight.Quest;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class KnightTest {

    @Test
    public void checkIfDragonIsKilled(){
        Quest mockQuest = mock(Quest.class);

        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.makeQuest();
    }
}
