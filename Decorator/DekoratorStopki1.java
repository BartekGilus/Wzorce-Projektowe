package com.company;

public class DekoratorStopki1 extends DekoratorPotwierdzenia {
    public DekoratorStopki1(Komponent mk) {
        super(mk);
    }

    @Override
    public void drukuj() {
        super.drukuj();
        System.out.println("Stopka 1");
    }
}
