package com.recipe.app;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class RecipeAppAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeAppAdminApplication.class, args);
	}

}
