package soundsystem.config;

import soundsystem.CDPlayer;
import soundsystem.CompactDisc;
import soundsystem.MediaPlayer;
import soundsystem.SgtPeppers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDConfig.class)
public class CDPlayerConfig {

    @Bean
    public MediaPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }
}
