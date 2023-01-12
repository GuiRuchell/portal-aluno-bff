package br.com.code.plus.project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .directModelSubstitute(LocalTime.class, String.class)
                .directModelSubstitute(LocalDate.class, String.class)
                .directModelSubstitute(LocalDateTime.class, String.class)
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.code.plus.project"))
                .paths(PathSelectors.any())
                .build()
                .consumes(getContentType())
                .produces(getContentType())
                .apiInfo(this.getApiInfo());
    }

    private Set<String> getContentType() {
        final HashSet<String> mediaType = new HashSet<>();
        mediaType.add(MediaType.APPLICATION_JSON_UTF8_VALUE);
        return mediaType;
    }

    private ApiInfo getApiInfo() {
        return new ApiInfoBuilder()
                .title("Portal do aluno")
                .description("API para ferramenta Portal do Aluno")
                .version("1.0.0")
                .contact(this.getContact())
                .build();
    }

    private Contact getContact() {
        return new Contact("Code++",
                "",
                "ruchellguilherme@gmail.com");
    }
}
