package com.app.customer;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
    @Id
    private Integer guid;
    private String firstName;
    private String lastName;
    private String custType;

    public Customer(Integer guid, String firstName, String lastName, String custType) {
        this.guid = guid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.custType = custType;
    }

    public Integer getGuid() {
        return guid;
    }

    public void setGuid(Integer guid) {
        this.guid = guid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }
}
