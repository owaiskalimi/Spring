package com.smartshop.jwt.jwtsecurity.Controller;

import com.smartshop.jwt.jwtsecurity.Model.Customers;
import com.smartshop.jwt.jwtsecurity.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(value="/all")
    public List<Customers> findAll() {
        return customerRepository.findAll();
    }

    @GetMapping(value="/{Name}")
    public Customers findbyname(@PathVariable String Name)
    {
        return CustomerRepository.findbyname(Name);
    }

    @PostMapping(value="/load")
    public Customers load(@RequestBody final Customers customers)
    {
        CustomerRepository.save(customers);
    }
}
