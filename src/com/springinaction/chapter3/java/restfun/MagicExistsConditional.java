package restfun;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicExistsConditional implements Condition {

    @Override
    public boolean matches(
            ConditionContext conditionContext,
            AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment env = (Environment) conditionContext.getEnvironment();
        return env.containsProperty("magic");
    }
}
