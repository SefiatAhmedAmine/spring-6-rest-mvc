package com.aas.spring6restmvc.services;

import com.aas.spring6restmvc.models.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {
    List<Customer> getCostumers();
    Customer getCustomerById(UUID customerId);
    Customer saveNewCustomer(Customer customer);

    void updateCustomer(UUID customerId, Customer customer);
}
