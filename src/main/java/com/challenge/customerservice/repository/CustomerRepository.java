package com.challenge.customerservice.repository;

import com.challenge.customerservice.model.Customer;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository for performing CRUD operations on customer records in the database.
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByLastNameIgnoreCase(String lastName, Pageable pageable);
}
