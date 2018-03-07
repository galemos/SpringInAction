package myapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;

@Configuration
@Profile("dev")
public class DevelopmentProfileConfig {
    @Bean(destroyMethod = "")
    public DataSource dataSource(){
        return new EmbeddedDatabaseBuilder()
                .addScript("classpath:schema.sql")
                .addScript("classpath:test-data.sql")
                .build();
    }
}
