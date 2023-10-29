package org.example.vebinarcrud;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.vebinarcrud")
public class AppConfig {
    // Не требуется создавать бин HelloBean вручную, так как он будет найден и создан автоматически.
}