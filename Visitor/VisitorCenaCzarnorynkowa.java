package com.company;

public class VisitorCenaCzarnorynkowa implements Visitor {

    private double suma = 0.0;
    @Override
    public void VisitZwierze(Zwierze z) {
        this.suma += z.CenaCzarnorynkowa;
    }

    @Override
    public void VisitPtak(Ptak p) {
        this.suma += p.CenaCzarnorynkowa;
    }

    @Override
    public void VisitRyba(Ryba r) {
        this.suma += r.CenaCzarnorynkowa;
    }

    @Override
    public void VisitSsak(Ssak s) {
        this.suma += s.CenaCzarnorynkowa;
    }

    @Override
    public void VisitGady(Gad g) {
        this.suma += g.CenaCzarnorynkowa;
    }

    public void wypisz(){
        System.out.println("Cena czarnorynkowa wszystkich odwiedzonych zwierząt: "+ suma + " zł.");
    }
}
