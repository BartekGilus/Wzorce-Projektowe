package com.company;

public class DekoratorNaglowka2 extends DekoratorPotwierdzenia {

    public DekoratorNaglowka2(Komponent mk) {
        super(mk);
    }

    @Override
    public void drukuj() {
        System.out.println("Nagłówek 2");
        super.drukuj();
    }
}