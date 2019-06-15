This is a Spring Boot microservice which exposes customer contact information via a REST API. To run the service,   
run `./gradlew bootRun`. 

As part of the boot, the service will pre-populate its H2 in-memory database with two customer records from `data.sql`. All customers can be retrieved by calling `GET localhost:8080/v1/customers` and customers can be searched by last name by calling `GET localhost:8080/v1/customers?name={name}`. 

The API can be called over HTTP and the endpoint is free to access. A next logical step would be to secure this using HTTPS and by performing authentication and authorisation of callers. An extension would be to provide a `POST /customers` endpoint for saving a new customer and a `PUT /customers/{id}` endpoint for editing an existing customer.