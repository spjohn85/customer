package com.app.customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface CustomerRepository extends MongoRepository<Customer, Integer>{
    Customer findByFirstName(String firstName);
    List<Customer> findByCustType(String custType);
}
