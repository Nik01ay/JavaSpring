package org.dz17;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.beans.BeanProperty;
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
}
