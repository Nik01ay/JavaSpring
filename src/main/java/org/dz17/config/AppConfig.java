package org.dz17.config;

//import org.dz17.LogicClass;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan ("org.dz17")
@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

}
