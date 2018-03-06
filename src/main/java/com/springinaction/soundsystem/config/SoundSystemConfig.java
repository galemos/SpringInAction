package com.springinaction.soundsystem.config;

import com.springinaction.soundsystem.CDPlayer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({CDPlayer.class, CDConfig.class})
public class SoundSystemConfig {
}
