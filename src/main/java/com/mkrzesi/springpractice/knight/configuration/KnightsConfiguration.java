package com.mkrzesi.springpractice.knight.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath*:/knight/knights.xml"})
public class KnightsConfiguration {
}
