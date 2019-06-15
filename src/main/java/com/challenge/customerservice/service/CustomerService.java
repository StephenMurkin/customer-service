package com.challenge.customerservice.service;

import com.challenge.customerservice.model.Customer;
import com.challenge.customerservice.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service for performing CRUD operations on {@link com.challenge.customerservice.model.Customer} objects.
 */

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> getCustomers(Pageable pageable) {
        return customerRepository.findAll();
    }

    public List<Customer> getCustomers(String lastName, Pageable pageable) {
        return customerRepository.findByLastNameIgnoreCase(lastName, pageable);
    }
}
