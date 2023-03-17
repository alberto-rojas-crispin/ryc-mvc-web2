package mx.capacitarte.rycmvcweb2;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("mx.capacitarte.rycmvcweb2.restcontroller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(getApiInfo())
				;
	}
	
	private ApiInfo getApiInfo() {
		return new ApiInfo(
				"Service API",
				"Service API - Gestion de alumnos y profesores",
				"1.0",
				"http://capacitarte.mx/about",
				new Contact("Capacitarte", "https://capacitarte.mx", "capacitarte.ryc@gmail.com"),
				"**",
				"http://capacitarte.mx/license",
				Collections.emptyList()
				);
	}
}
