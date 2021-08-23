package com.company;

public abstract class Zwierze {

    public double Cena;
    public boolean Zdrowie;
    public String Rodzaj;
    public double CenaCzarnorynkowa;

    public Zwierze(double c, boolean z, double cenaCz, String r){
        this.Cena = c;
        this.Zdrowie = z;
        this.CenaCzarnorynkowa = cenaCz;
        this.Rodzaj = r;
    }

    public abstract void akceptuj(Visitor v);

    public void wypisz(){
       System.out.println("Zwierze: "+ Rodzaj +" Cena: "+ Cena +" Czy jest zdrowe? " + (Zdrowie ? "Tak" : "Nie") + " Cena na czarnym rynku: " + CenaCzarnorynkowa);
    }

}
