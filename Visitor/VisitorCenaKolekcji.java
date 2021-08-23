package com.company;

public class VisitorCenaKolekcji implements  Visitor{

    private double suma = 0.0;

    @Override
    public void VisitZwierze(Zwierze z) {
        this.suma += z.Cena;
    }

    @Override
    public void VisitPtak(Ptak p) {
        this.suma += p.Cena;
    }

    @Override
    public void VisitRyba(Ryba r) {
        this.suma += r.Cena;
    }

    @Override
    public void VisitSsak(Ssak s) {
        this.suma += s.Cena;
    }

    @Override
    public void VisitGady(Gad g) {
        this.suma += g.Cena;
    }

    public void wypisz(){
        System.out.println("Cena wszystkich odwiedzonych zwierząt: "+ suma + " zł.");
    }
}
