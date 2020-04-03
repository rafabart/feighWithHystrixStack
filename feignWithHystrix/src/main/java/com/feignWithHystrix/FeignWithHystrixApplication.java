package com.feignWithHystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

// Habilita o Hystrix na aplicação.
@EnableHystrix
// Habilita o Feign na aplicação.
@EnableFeignClients
@SpringBootApplication
public class FeignWithHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignWithHystrixApplication.class, args);
    }

}
