package com.company;

public class ZapytanieOracle extends SzablonZapyania {
    @Override
    protected String formatujConnect(String baza) {
        return "Baza oracle: " + baza + "\t";
    }

    @Override
    protected String formatujSelect(String zapytanie) {
        return zapytanie + ";";
    }
}
