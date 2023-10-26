package org.dz17.config;

import org.dz17.ContactLoadingInterface;
import org.dz17.DefaultContactLoading;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
//@Profile("default")
public class DefaultAppConfig {
    @Bean
    public ContactLoadingInterface contactLoadingInterface() {
        return new DefaultContactLoading();
    }
}
