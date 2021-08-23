package com.company;

public class VisitorWeterynarz implements Visitor {

    @Override
    public void VisitZwierze(Zwierze z) {
        String stan_zdrowia, leczenie;
        if(z.Zdrowie){
            stan_zdrowia = "Zdrowe";
            leczenie = "brak";
        }
        else{
            stan_zdrowia = "Chore";
            if(z.CenaCzarnorynkowa >= 2 * z.Cena) leczenie = "Klinika";
            else leczenie = "Antybiotyk";
        }
        System.out.println("Zwierze: " + z.Rodzaj + " Stan zdrowia: " + stan_zdrowia + " Sposob leczenia: " + leczenie);
    }

    @Override
    public void VisitPtak(Ptak p) {
        String stan_zdrowia, leczenie;
        if(p.Zdrowie){
            stan_zdrowia = "Zdrowe";
            leczenie = "brak";
        }
        else{
            stan_zdrowia = "Chore";
            if(p.CenaCzarnorynkowa >= 2 * p.Cena) leczenie = "Klinika";
            else leczenie = "Antybiotyk";
        }
        System.out.println("Zwierze: " + p.Rodzaj + " Stan zdrowia: " + stan_zdrowia + " Sposob leczenia: " + leczenie);

    }

    @Override
    public void VisitRyba(Ryba r) {
        String stan_zdrowia, leczenie;
        if(r.Zdrowie){
            stan_zdrowia = "Zdrowe";
            leczenie = "brak";
        }
        else{
            stan_zdrowia = "Chore";
            if(r.CenaCzarnorynkowa >= 2 * r.Cena) leczenie = "Klinika";
            else leczenie = "Antybiotyk";
        }
        System.out.println("Zwierze: " + r.Rodzaj + " Stan zdrowia: " + stan_zdrowia + " Sposob leczenia: " + leczenie);

    }

    @Override
    public void VisitSsak(Ssak s) {
        String stan_zdrowia, leczenie;
        if(s.Zdrowie){
            stan_zdrowia = "Zdrowe";
            leczenie = "brak";
        }
        else{
            stan_zdrowia = "Chore";
            if(s.CenaCzarnorynkowa >= 2 * s.Cena) leczenie = "Klinika";
            else leczenie = "Antybiotyk";
        }
        System.out.println("Zwierze: " + s.Rodzaj + " Stan zdrowia: " + stan_zdrowia + " Sposob leczenia: " + leczenie);

    }

    @Override
    public void VisitGady(Gad g) {
        String stan_zdrowia, leczenie;
        if(g.Zdrowie){
            stan_zdrowia = "Zdrowe";
            leczenie = "brak";
        }
        else{
            stan_zdrowia = "Chore";
            if(g.CenaCzarnorynkowa >= 2 * g.Cena) leczenie = "Klinika";
            else leczenie = "Antybiotyk";
        }
        System.out.println("Zwierze: " + g.Rodzaj + " Stan zdrowia: " + stan_zdrowia + " Sposob leczenia: " + leczenie);

    }
}
