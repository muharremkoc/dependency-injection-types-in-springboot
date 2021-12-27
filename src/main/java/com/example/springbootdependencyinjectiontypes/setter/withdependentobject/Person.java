package com.example.springbootdependencyinjectiontypes.setter.withdependentobject;


public class Person {

    private int id;
    private String firstName;
    private Nationality nationality;

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

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }
    void values(){
        System.out.println(id+"\n"+firstName);
        System.out.println(nationality);
    }
}
