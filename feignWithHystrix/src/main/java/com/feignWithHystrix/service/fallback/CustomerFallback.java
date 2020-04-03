package com.feignWithHystrix.service.fallback;

import com.feignWithHystrix.entity.Customer;
import com.feignWithHystrix.service.CustomerClientService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CustomerFallback implements CustomerClientService {

    @Override
    public List<Customer> findAll() {

        final Customer customer = new Customer(2, "Fallback Xablau");

        return Arrays.asList(customer);
    }
}
