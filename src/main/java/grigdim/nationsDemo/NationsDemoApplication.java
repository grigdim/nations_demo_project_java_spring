package grigdim.nationsDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "grigdim.nationsDemo.repositories")
@ComponentScan(basePackages = {"grigdim.nationsDemo.controllers", "grigdim.nationsDemo.entities", "grigdim.nationsDemo.repositories", "grigdim.nationsDemo.services"})
@EnableWebMvc
public class NationsDemoApplication implements WebMvcConfigurer{

    public static void main(String[] args) {
        SpringApplication.run(NationsDemoApplication.class, args);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*");
    }
}

