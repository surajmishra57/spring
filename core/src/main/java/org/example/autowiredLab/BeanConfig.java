package org.example.autowiredLab;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;

@Configuration
@PropertySource("classpath:application.properties")
public class BeanConfig {

    @Value("${catalog.name}")
    public String data;

    @Bean
    @Order(2)
//    @Primary
    @Qualifier("action")
    public MovieCatalog actionCatalog() {
        return new MovieCatalog("action", "good");
    }

    @Bean
    @Order(1)
    @Qualifier("comedy")
    public MovieCatalog comedyCatalog() {
        return new MovieCatalog("comedy", "good");
    }

    @Bean
    @Order(3)
    public MovieCatalog horrorCatalog() {
        return new MovieCatalog("horror", "good");
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
