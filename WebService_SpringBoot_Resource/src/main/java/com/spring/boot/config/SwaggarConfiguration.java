package com.spring.boot.config;

import java.nio.file.Paths;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggarConfiguration {

	Contact contact=new Contact("Shyam","www.amazon.com/radhe","radhe@gmail.com");
	public SwaggarConfiguration() {


		System.out.println("SwaggarConfiguration 0 param constructor");
	}

	public Docket doicket() {
		Docket docket=new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.spring.boot.config"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(info);
	return docket;
	}

	ApiInfo info=new ApiInfo("Book Resource API"
			,"This is developed to retrive book details and to add new book details"
			,"1.0"
			,"www.google.com"
			,contact
			,"Apache License"
			,"www.apache.org"
			);
}
