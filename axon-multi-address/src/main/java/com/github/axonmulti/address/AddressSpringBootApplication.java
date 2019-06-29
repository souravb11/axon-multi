package com.github.axonmulti.address;

import lombok.extern.slf4j.Slf4j;
import org.axonframework.boot.autoconfig.JdbcAutoConfiguration;
import org.axonframework.boot.autoconfig.JpaAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = {"com.github.axonmulti.common", "com.github.axonmulti.address"},
        exclude = {ErrorMvcAutoConfiguration.class
                , JpaAutoConfiguration.class
                , JdbcAutoConfiguration.class
})
@EnableEurekaClient
@Slf4j
public class AddressSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AddressSpringBootApplication.class, args);
    }

}
