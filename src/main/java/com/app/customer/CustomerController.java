package com.app.customer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {

    private CustomerRepository custRepo;

    public CustomerController(CustomerRepository custRepo) {
        this.custRepo = custRepo;
    }

    @GetMapping("/all")
    public List<Customer> findAll(){
        return custRepo.findAll();
    }

    @GetMapping("/firstName={name}")
    public Customer findByName(@PathVariable final String name){
        return custRepo.findByFirstName(name);
    }

    @GetMapping("/type={custType}")
    public List<Customer> findByType(@PathVariable final String custType){
        return custRepo.findByCustType(custType);
    }

    @PostMapping("/save")
    public void saveCustomer(@RequestBody final Customer cust){
        custRepo.save(cust);
    }
    @PostMapping("/{guid}")
    public void saveCustomer(@PathVariable final Integer guid, @RequestBody final Customer cust){
        cust.setGuid(guid);
        custRepo.save(cust);
    }
}
