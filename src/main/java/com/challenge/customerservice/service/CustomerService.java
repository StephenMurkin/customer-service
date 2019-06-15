package com.challenge.customerservice.service;

import com.challenge.customerservice.model.Customer;
import com.challenge.customerservice.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service for performing CRUD operations on {@link com.challenge.customerservice.model.Customer} objects.
 */

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}
