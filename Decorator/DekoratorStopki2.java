package com.company;

public class DekoratorStopki2 extends DekoratorPotwierdzenia {
    public DekoratorStopki2(Komponent mk) {
        super(mk);
    }

    @Override
    public void drukuj() {
        super.drukuj();
        System.out.println("Stopka 2");
    }
}