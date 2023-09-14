package com.company;

public class Beeline extends Operator implements Printable{
    String slogan ;
    int numbersPhone;

    public String getSlogan() {
        return slogan;
    }

    public int getNumbersPhone() {
        return numbersPhone;
    }

    public Beeline(String name, String slogan, int numbersPhone) {
        super(name);
        this.slogan = slogan;
        this.numbersPhone = numbersPhone;

    }

    @Override
    public void print() {
        super.print();
        System.out.println("Beeline----> parametr: "+ " Слогон: " +getSlogan() + " номер оператора: " +getNumbersPhone());
    }
}
