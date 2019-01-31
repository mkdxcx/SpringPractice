package com.mkrzesi.springpractice.knight.configuration;

import com.mkrzesi.springpractice.knight.*;
import com.mkrzesi.springpractice.knight.aspects.Minstrel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfiguration {

    @Bean(name = "braveKnightOne")
    public Knight braveKnightOne() {
        return new BraveKnight(braveQuest());
    }

    @Bean(name = "braveKnightTwo")
    public Knight braveKnightTwo() {
        return new BraveKnight(rescueQuest());
    }

    @Bean
    public Knight cowardKnight() {
        return new CowardKnight(cowardQuest());
    }

    /*---------------------------------------------------------*/

    @Bean
    public Quest braveQuest() {
        return new KillDragonQuest();
    }

    @Bean
    public Quest cowardQuest() {
        return new CowardQuest();
    }

    @Bean
    public Quest rescueQuest() {
        return new RescueDamsel();
    }

    @Bean
    public Minstrel getMinstrel(){
        return new Minstrel();
    }
}

