package com.company;

public class Operator implements Printable{
    String name;

    public Operator(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Operators:"+" название: "+getName());
    }
}
