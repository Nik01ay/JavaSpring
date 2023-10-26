package org.dz17.config;

import org.dz17.ContactLoadingInterface;
import org.dz17.InitContactLoading;
import org.dz17.TextFileInteface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application-init.properties")
@Profile("init")
public class InitAppConfig {
    @Bean
    public ContactLoadingInterface contactLoadingInterface() {
        return new InitContactLoading();
    }
}


