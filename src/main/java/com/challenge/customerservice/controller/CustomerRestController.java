package com.challenge.customerservice.controller;

import com.challenge.customerservice.model.Customer;
import com.challenge.customerservice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

/**
 * REST controller for performing CRUD operations on customer contact details.
 */

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "v1/customers",
        consumes = APPLICATION_JSON_UTF8_VALUE,
        produces = APPLICATION_JSON_UTF8_VALUE)
public class CustomerRestController {

    private final CustomerService customerService;

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Customer>> getCustomers(@RequestParam(required = false) String name, Pageable pageable) {

        if (name != null) {
            log.info("Received request to retrieve all customers with a last name of {}", name);
            return ResponseEntity.ok(customerService.getCustomers(name, pageable));
        } else {
            log.info("Received request to retrieve all customers");
            return ResponseEntity.ok(customerService.getCustomers(pageable));
        }
    }
}
