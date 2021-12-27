package com.example.springbootdependencyinjectiontypes.constructor.dependentobjects;

public class Country {
    private String name;

    public Country(String name) {
        super();
        this.name = name;
    }

    public String goValue(){
        return "Country:"+name;
    }
}
