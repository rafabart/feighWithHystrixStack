package com.webApp.service;

import com.webApp.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {


    private List<Customer> customerList = new ArrayList<>(
            Arrays.asList(new Customer(1, "Xablau"))
    );


    public List<Customer> findAll() {
        return this.customerList;
    }


    public void create(final Customer customer) {
        customerList.add(customer);
    }
}
