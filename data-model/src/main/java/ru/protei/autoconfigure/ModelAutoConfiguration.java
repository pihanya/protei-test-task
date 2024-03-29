package ru.protei.autoconfigure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@Configuration
@EntityScan(basePackages = "ru.protei.model")
@EnableJpaRepositories(basePackages = "ru.protei.repository")
@EnableTransactionManagement @EnableJpaAuditing
public class ModelAutoConfiguration {

}
