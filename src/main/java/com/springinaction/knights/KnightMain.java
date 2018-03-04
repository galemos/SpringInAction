package com.springinaction.knights;

import com.springinaction.knights.config.KnightConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext contextXml =
                new ClassPathXmlApplicationContext(
                        "META-INF/spring/knights.xml");
        AnnotationConfigApplicationContext contextAnnotationConfig =
                new AnnotationConfigApplicationContext(KnightConfig.class);


        Knight knight = contextXml.getBean(Knight.class);
        knight.embarkOnQuest();
        contextXml.close();

        Knight secondKnight = contextAnnotationConfig.getBean(Knight.class);
        secondKnight.embarkOnQuest();
        contextAnnotationConfig.close();
    }
}
