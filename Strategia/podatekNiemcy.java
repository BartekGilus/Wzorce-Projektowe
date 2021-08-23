package com.company;

public class podatekNiemcy implements obliczPodatek {

    private final double podatek = 0.20;

    @Override
    public double kwotaPodatku(int ilosc, double cena) {
        return ilosc * (cena + (cena * podatek));
    }
}
