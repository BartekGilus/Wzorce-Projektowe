package com.company;

public class Konfiguracja {

    public Komponent dwaNaglowki(){
        return new DekoratorNaglowka1(new DekoratorNaglowka2(new DekoratorStopki1(new Potwierdzenie())));
    }

    public Komponent dwieStopki(){
        return new DekoratorNaglowka1(new DekoratorStopki1(new DekoratorStopki2(new Potwierdzenie())));
    }
}
