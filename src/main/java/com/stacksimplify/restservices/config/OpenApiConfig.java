package com.stacksimplify.restservices.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;


@Configuration
@OpenAPIDefinition(info = @Info(title = "Stacksimplify User Management Service",
        description = "This page lists all API's of User Management",
        summary = "User Management",
        termsOfService = "Stacksimplify",
        contact = @Contact(name = "Luis Rivera", email = "lriveraascencio@deloitte.com"),
        license = @License(name = "License 2.0"), version = "2.0"),
        servers = {@Server(description = " Generated URL", url = "http://localhost:8080")})
public class OpenApiConfig {
	
	@Bean
	public GroupedOpenApi userApi() {
		return GroupedOpenApi.builder()
				.group("users")
				.pathsToMatch("/users/**")
				.build();
	}
	
	@Bean
	public GroupedOpenApi anotherApi() {
		return GroupedOpenApi.builder()
				.group("another")
				.pathsToExclude("/versioning/**", "/modelmapper/**", "/mapstruct/**", "/jsonview/**", "/jacksonfilter/**", "/hateoas/**", "/hello/**")
				.build();
	}
	

}
