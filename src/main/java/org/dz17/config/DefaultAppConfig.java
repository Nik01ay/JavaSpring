package org.dz17.config;

import org.dz17.ContactLoadingInterface;
import org.dz17.DefaultContactLoading;
import org.dz17.InitContactLoading;
//import org.dz17.LogicClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@ComponentScan ("org.dz17")
@Configuration
@PropertySource("classpath:application.properties")
public class DefaultAppConfig {
    @Bean
    public ContactLoadingInterface contactLoadingInterface() {
        return new DefaultContactLoading();
    }

}
