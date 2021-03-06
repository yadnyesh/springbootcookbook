package io.yadnyesh.springbootcookbook;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootcookbookApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootcookbookApplication.class, args);
	}
	
	@Bean
	public StartupRunner schedulerRunner() {
		return new StartupRunner();
	}
}
