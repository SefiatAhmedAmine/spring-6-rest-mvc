package com.aas.spring6restmvc.services;

import com.aas.spring6restmvc.models.Customer;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final Map<UUID, Customer> costumers;

    public CustomerServiceImpl() {
        this.costumers = new HashMap<>();

        Customer customer0 = Customer.builder()
                .id(UUID.randomUUID())
                .customerName("Ahmed")
                .version(1)
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();
        Customer customer1 = Customer.builder()
                .id(UUID.randomUUID())
                .customerName("Amine")
                .version(1)
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();
        Customer customer2 = Customer.builder()
                .id(UUID.randomUUID())
                .customerName("Sefiat")
                .version(1)
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();
        this.costumers.put(customer0.getId(), customer0);
        this.costumers.put(customer1.getId(), customer1);
        this.costumers.put(customer2.getId(), customer2);
    }
    @Override
    public List<Customer> getCostumers() {
        return new ArrayList<>(this.costumers.values());
    }

    @Override
    public Customer getCustomerById(UUID customerId) {
        return this.costumers.get(customerId);
    }

    @Override
    public Customer saveNewCustomer(Customer customer) {
        Customer savedCustomer = Customer.builder()
                .id(UUID.randomUUID())
                .version(customer.getVersion())
                .customerName(customer.getCustomerName())
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();
        this.costumers.put(savedCustomer.getId(), savedCustomer);
        return savedCustomer;
    }
}
