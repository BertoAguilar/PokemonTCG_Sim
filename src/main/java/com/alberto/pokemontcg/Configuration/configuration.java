package com.alberto.pokemontcg.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class configuration {
    @Bean
    RestTemplate restTemplate() {
	    return new RestTemplate();
	}


}
