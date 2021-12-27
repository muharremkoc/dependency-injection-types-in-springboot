package com.example.springbootdependencyinjectiontypes.constructor.dependentobjects;

public class Employee {
    private String id;
    private String name;
    private Country country;

    public Employee() {
        System.out.println("def cons");
    }

    public Employee(String id, String name, Country country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    void show(){
        System.out.println(id+"\n"+name);
        System.out.println(country.goValue());
    }
}
