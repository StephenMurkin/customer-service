package com.challenge.customerservice.controller;

import com.challenge.customerservice.model.Customer;
import com.challenge.customerservice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<List<Customer>> getCustomers() {

        log.info("Received request to retrieve all customers");
        return ResponseEntity.ok(customerService.getCustomers());
    }
}
