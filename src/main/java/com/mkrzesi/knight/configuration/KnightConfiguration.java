package com.mkrzesi.knight.configuration;

import com.mkrzesi.knight.BraveKnight;
import com.mkrzesi.knight.KillDragonQuest;
import com.mkrzesi.knight.Knight;
import com.mkrzesi.knight.Quest;
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
