package com.company;

public class Main {

    public static void main(String[] args) {
        Operator[] operators = new Operator[]{createObject("NurTelecom"), createObject("MegaCom"), createObject("Beeline")};
        for (int i = 0; i < operators.length; i++) {
            operators[i].print();
            System.out.println();
        }

    }

    public static Operator createObject(String className) {
        switch (className) {
            case "NurTelecom":
                NurTelecom nurTelecom = new NurTelecom("NurTelecom", 13);
                return nurTelecom;
            case "MegaCom":
                MegaCom megaCom = new MegaCom("MegaCom", 99.9);
                return megaCom;
            case "Beeline":
                Beeline beeline = new Beeline("Beeline", "Живи на яркой стороне", 611);
                return beeline;
        }
        return null;
    }

}