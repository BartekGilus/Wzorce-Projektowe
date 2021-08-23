package com.company;

public class podatekPolska implements  obliczPodatek{

    private final double podatek = 0.23;

    @Override
    public double kwotaPodatku(int ilosc, double cena) {
        return ilosc * (cena + (cena * podatek));
    }
}
