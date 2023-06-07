package com.sds.todoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TodoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoServerApplication.class, args);
	}

}
