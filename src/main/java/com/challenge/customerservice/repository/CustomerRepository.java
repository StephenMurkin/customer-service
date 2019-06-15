package com.challenge.customerservice.repository;

import com.challenge.customerservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for performing CRUD operations on customer records in the database.
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
