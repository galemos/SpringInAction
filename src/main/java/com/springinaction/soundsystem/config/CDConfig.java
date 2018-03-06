package com.springinaction.soundsystem.config;

import com.springinaction.soundsystem.CompactDisc;
import com.springinaction.soundsystem.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {

    @Bean
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }
}
