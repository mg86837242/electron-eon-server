package dev.by;

import dev.by.security.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class ElectronEonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronEonApplication.class, args);
    }
}
