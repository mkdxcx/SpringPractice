package com.mkrzesi.springpractice.knight.configuration;

import com.mkrzesi.springpractice.knight.aspects.Minstrel;
import com.mkrzesi.springpractice.knight.business.*;
import com.mkrzesi.springpractice.knight.interfaces.Knight;
import com.mkrzesi.springpractice.knight.interfaces.Quest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class KnightConfiguration {

    Logger logger = LoggerFactory.getLogger(getClass());

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
    public Minstrel minstrelAspect(){
        return new Minstrel();
    }

}

