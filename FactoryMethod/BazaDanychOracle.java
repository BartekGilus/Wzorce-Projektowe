package com.company;

public class BazaDanychOracle extends BazaDanych {
    @Override
    public void Połącz() {
        System.out.println("Połączono z baza danych Oracle");
    }

    @Override
    public void WykonajZapytanie(String z) {
        System.out.println("Wykonano zapytanie do bazy danych Oracle: "+ z);
    }
}
