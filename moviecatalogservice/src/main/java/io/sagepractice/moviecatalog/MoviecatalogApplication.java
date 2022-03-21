package io.sagepractice.moviecatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MoviecatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviecatalogApplication.class, args);
		
		
	}
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
