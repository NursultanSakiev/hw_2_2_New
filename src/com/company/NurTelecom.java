package com.company;

public class NurTelecom extends Operator implements Printable{
    int ageOfCompany;

    public int getAgeOfCompany() {
        return ageOfCompany;
    }

    public NurTelecom(String name, int ageOfCompany) {
        super(name);
        this.ageOfCompany = ageOfCompany;
    }



    @Override
    public void print() {
        super.print();
        System.out.println("NurTelecom-----> parametr:" + " возраст компании: " +getAgeOfCompany());
    }
}
