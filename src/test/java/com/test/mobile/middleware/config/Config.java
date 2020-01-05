package com.test.mobile.middleware.config;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.impl.DefaultJwtBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import java.util.Locale;

@ComponentScan("com.test.mobile.middleware")
@PropertySource("classpath:/endpoints.properties")
public class Config {

    @Bean
    public Faker getFaker() {
        return new Faker(new Locale("en-IND"));
    }

    @Bean
    public FakeValuesService getFakeValuesService() {
        return new FakeValuesService(new Locale("en-IND"), new RandomService());
    }

    @Bean
    public JwtBuilder getJwtBuilder(){ return new DefaultJwtBuilder(); }
}
