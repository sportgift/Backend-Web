package io.sportgift.ws;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@Slf4j
public class SportGiftRootApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SportGiftRootApplication.class);
        springApplication.run(args);
    }

}
