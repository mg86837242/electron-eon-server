package dev.by.security;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RsaKeyProperties.class)
public class RsaKeyConfig {
}

// References:
// -- maintain separation of concerns w/o modifying the main class (i.e.,
// adding `@EnableConfigurationProperties(RsaKeyProperties.class)` to the
// main class: https://www.baeldung.com/spring-enable-config-properties
// -- alternatively, use `@ConfigurationPropertiesScan` to replace the
// `@EnableConfigurationProperties(RsaKeyProperties.class)` in this file
// would also work