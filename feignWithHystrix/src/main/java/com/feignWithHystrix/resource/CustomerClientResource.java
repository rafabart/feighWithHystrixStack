package com.feignWithHystrix.resource;

import com.feignWithHystrix.entity.Customer;
import com.feignWithHystrix.service.CustomerClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customerClients")
public class CustomerClientResource {


    @Autowired
    private CustomerClientService customerClientService;


    @GetMapping
    public ResponseEntity<List<Customer>> findAll() {
        return ResponseEntity.ok(customerClientService.findAll());
    }
}
