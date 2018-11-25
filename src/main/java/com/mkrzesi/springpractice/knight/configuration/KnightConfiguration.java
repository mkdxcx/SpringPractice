package com.mkrzesi.springpractice.knight.configuration;

import com.mkrzesi.springpractice.knight.BraveKnight;
import com.mkrzesi.springpractice.knight.KillDragonQuest;
import com.mkrzesi.springpractice.knight.Knight;
import com.mkrzesi.springpractice.knight.Quest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfiguration {

    @Bean(name = "knight")
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean(name = "quest")
    public Quest quest(){
        return new KillDragonQuest();
    }
}
