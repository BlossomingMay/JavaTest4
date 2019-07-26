package com.huang.submodel.controller;

import com.huang.submodel.domain.Customer;
import com.huang.submodel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable("id") int id){
        customerService.delete(id);
    }

    @PostMapping("/")
    public void insert(@RequestBody Customer customer){
        System.out.println(customer.toString());
        customerService.insert(customer);
    }

    @PutMapping("/")
    public Customer update(@RequestBody Customer customer){
        customerService.update(customer);
        return customer;

    }

}
