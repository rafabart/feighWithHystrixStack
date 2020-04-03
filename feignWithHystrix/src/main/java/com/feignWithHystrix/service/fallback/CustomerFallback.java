package com.feignWithHystrix.service.fallback;

import com.feignWithHystrix.entity.Customer;
import com.feignWithHystrix.service.CustomerClientService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerFallback implements CustomerClientService {


    @Override
    public List<Customer> findAll() {
        return new ArrayList<>();
    }
}
