package org.dz17;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.beans.BeanProperty;
@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan ("org.dz17")
public class AppConfig {
    @Bean
    public LogicClass simpleLogicClass(){
        return new LogicClass();
    }
    @Bean
    public LogicClass logicClassData(){
        return new LogicClass("lkass", 42);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer configurer =new PropertySourcesPlaceholderConfigurer();
        configurer.setLocation(new ClassPathResource("application.properties"));

        return configurer;
    }
}
