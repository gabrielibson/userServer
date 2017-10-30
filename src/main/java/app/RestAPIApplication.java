package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("api")
@EntityScan(basePackages= {"api.model"})
public class RestAPIApplication {
	
	/**
	 * Executa a aplicacao
	 * @param args argumentos
	 */
	public static void main(String[] args) {
		SpringApplication.run(RestAPIApplication.class, args);
	}

}
