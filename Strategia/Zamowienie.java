package com.company;

public class Zamowienie {

    private double produkty[];
    private obliczPodatek podatek;

    public Zamowienie(double p[], kraje kraj){
        this.produkty = p;
        this.podatek = new Konfiguracja(kraj).returnKraj();
    }

    public double licz(){
        double suma = 0;
        for(double p: produkty){
            suma += podatek.kwotaPodatku(2, p);
        }

        return suma;
    }

}
