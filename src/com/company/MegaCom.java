package com.company;

public class MegaCom extends Operator implements Printable{
    double speedInternet;

    public MegaCom(String name, double speedInternet) {
        super(name);
        this.speedInternet = speedInternet;
    }

    public double getSpeedInternet() {
        return speedInternet;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("MegaCom----> parametr:"+ " скорость интернета: " +getSpeedInternet());
    }
}
