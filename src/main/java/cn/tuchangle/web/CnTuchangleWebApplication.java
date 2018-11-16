package cn.tuchangle.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

@SpringBootApplication
public class CnTuchangleWebApplication {

  public static void main(String[] args) {
    SpringApplication.run(CnTuchangleWebApplication.class, args);
  }

  @Bean
  public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
    return factory -> factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/"));
  }

}
