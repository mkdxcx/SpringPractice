package com.mkrzesi.springpractice.knight.configuration;

import com.mkrzesi.springpractice.knight.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfiguration {

    @Bean
    public Knight braveKnight() {
        return new BraveKnight(braveQuest());
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
    public Quest cowardQuest(){return new CowardQuest();}
}
