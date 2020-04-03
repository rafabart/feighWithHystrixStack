package com.webApp.resource;

import com.webApp.entity.Customer;
import com.webApp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerResource {


    @Autowired
    private CustomerService customerService;


    @GetMapping
    public ResponseEntity<List<Customer>> findAll() {

        return ResponseEntity.ok(customerService.findAll());
    }


    @PostMapping()
    public ResponseEntity<Void> create(@RequestBody final Customer customer) {

        customerService.create(customer);

        return ResponseEntity.ok().build();
    }
}
