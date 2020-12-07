package br.unit.web.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan({"br.unit.web.api.controller"})
@EntityScan({"br.unit.web.api.entity"})
public class ApiPaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPaApplication.class, args);
	}

}

