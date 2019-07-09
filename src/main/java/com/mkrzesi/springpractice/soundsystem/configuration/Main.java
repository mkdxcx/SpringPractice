package com.mkrzesi.springpractice.soundsystem.configuration;

import com.mkrzesi.springpractice.soundsystem.SgtPeppers;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com\\mkrzesi\\springpractice\\soundsystem\\configuration\\");

    SgtPeppers sgtPeppers = context.getBean("sgtPeppers", SgtPeppers.class);



}
