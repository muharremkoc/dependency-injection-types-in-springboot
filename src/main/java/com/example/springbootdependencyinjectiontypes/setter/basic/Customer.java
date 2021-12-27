package com.example.springbootdependencyinjectiontypes.setter.basic;

public class Customer {

    private int id;
    private String firstName;
    private String country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    void values(){
        System.out.println(id+"\n"+firstName+"\n"+country);
    }

}
