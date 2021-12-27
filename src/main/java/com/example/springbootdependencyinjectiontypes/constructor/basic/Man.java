package com.example.springbootdependencyinjectiontypes.constructor.basic;

public class Man {
    private String id;
    private String name;

    public Man(String id) {
        this.id = id;
    }

    public Man(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public void show(){
        System.out.println(id+"\n"+name);
    }
}
