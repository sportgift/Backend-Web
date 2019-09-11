package io.sportgift.ws.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication(scanBasePackages = {
        "io.sportgift.ws.controller",
        "io.sportgift.dao",
        "io.sportgift.service"
})
@EnableJdbcRepositories("io.sportgift.dao")
@Slf4j
public class SportGiftRootApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SportGiftRootApplication.class);
        springApplication.run(args);
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

}
