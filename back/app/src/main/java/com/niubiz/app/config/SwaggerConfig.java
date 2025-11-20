package com.niubiz.app.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(
    title = "Product API",
    version = "1.0",
    description = "API documentation for Product application",
    contact = @Contact(name = "Enzo Esteban", email = "enzo.esteban.q@gmail.com")
    ), servers = {
        @Server(description = "dev", url = "http://localhost:8080")
    }
)
public class SwaggerConfig {

}
