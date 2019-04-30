package com.smartshop.jwt.jwtsecurity.Repository;

import com.smartshop.jwt.jwtsecurity.Model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CustomerRepository extends JpaRepository <Customers, Long>{

    static Customers findbyname(String name) {

    }
}
