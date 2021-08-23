package com.company;

public class Main {

    public static void main(String[] args) {
        Konfiguracja config = new Konfiguracja();
        Komponent k1 = config.dwieStopki();
        Komponent k2 = config.dwaNaglowki();

        k1.drukuj();
        System.out.println();
        k2.drukuj();
    }
}
