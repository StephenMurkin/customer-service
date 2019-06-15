package com.challenge.customerservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import javax.persistence.*;

/**
 * Represents a customer's contact details.
 */

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Customer {

    @Id
    @JsonProperty
    @GeneratedValue
    @Column(nullable = false)
    private Long id;

    @JsonProperty
    @Column(nullable = false)
    private String firstName;

    @JsonProperty
    @Column(nullable = false)
    private String lastName;

    @JsonProperty
    private String phone;

    @JsonProperty
    @Column(nullable = false)
    private String email;

    @JsonUnwrapped
    private Address address;

    /**
     * Represents a physical address. I have logically grouped these fields together into a separate class because
     * there is scope for re-use in other contexts.
     */

    @Embeddable
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private static class Address {

        @JsonProperty
        private String houseNumber;

        @JsonProperty
        private String street;

        @JsonProperty
        private String city;

        @JsonProperty
        private String county;

        @JsonProperty
        private String state;

        @JsonProperty
        private String country;

        @JsonProperty
        private String postCode;
    }
}
