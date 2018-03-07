package restfun;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

public class MagicBean {

    @Bean
    @Conditional(MagicExistsConditional.class)
    public MagicBean magicBean(){
        return null;
    }
}
