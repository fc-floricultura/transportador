package br.com.fc.floricultura.transportador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class TransportadorApplication {

  public static void main(String[] args) {
    SpringApplication.run(TransportadorApplication.class, args);
  }

  @Bean
  @Scope("prototype")
  public Logger produceLogger(InjectionPoint injectionPoint) {
    Class<?> classOnWired = injectionPoint.getMember().getDeclaringClass();
    return LoggerFactory.getLogger(classOnWired);
  }

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2).select()
        .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class)).paths(PathSelectors.any()).build();
  }

}
