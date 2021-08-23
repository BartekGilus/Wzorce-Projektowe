package com.company;

public class DekoratorNaglowka1 extends DekoratorPotwierdzenia {

    public DekoratorNaglowka1(Komponent mk) {
        super(mk);
    }

    @Override
    public void drukuj() {
        System.out.println("Nagłówek 1");
        super.drukuj();
    }
}
