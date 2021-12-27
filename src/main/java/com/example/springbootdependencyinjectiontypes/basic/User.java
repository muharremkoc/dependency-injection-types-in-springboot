package com.example.springbootdependencyinjectiontypes.basic;

public class User {
    private Address address;

    public User(Address address) {
        this.address = address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
