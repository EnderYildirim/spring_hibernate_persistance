package com.example.spring.dao;

import java.util.List;

import com.example.spring.model.Customer;

public interface CustomerDAO {

    void save(Customer c);
    
    List<Customer> list();
    
}
