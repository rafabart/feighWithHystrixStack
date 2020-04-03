package com.feignWithHystrix.service;

import com.feignWithHystrix.entity.Customer;
import com.feignWithHystrix.service.fallback.CustomerFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/* @FeignClient -> através dela, dizemos qual é a 'url' que nossa API ira fazer a requisição.
 * fallback = CustomerFallback.class -> é a classe com o metodo implementado nessa interface
 * que sera chamado caso o metodo falhe na chamada da url no FeighClient.
 */
@FeignClient(url = "http://localhost:8080/customers/", name = "customerClient", fallback = CustomerFallback.class)
public interface CustomerClientService {

    @GetMapping
    List<Customer> findAll();
}
