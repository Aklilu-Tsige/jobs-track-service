package org.aklilu.testlab4tech;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Jobs Tracker API", version = "1.0.0", description = "Jobs tracking Tool"))
public class Testlab4techApplication {

	public static void main(String[] args) {
		SpringApplication.run(Testlab4techApplication.class, args);
	}

}
