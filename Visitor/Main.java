package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Zwierze> zwierzeta = new ArrayList<Zwierze>();
        zwierzeta.add(new Ptak(200,true, 150));
        zwierzeta.add(new Ptak(140, false, 100));
        zwierzeta.add(new Ryba(200, true, 180));
        zwierzeta.add(new Ssak(400, true, 300));
        zwierzeta.add(new Gad(300, false, 250));

        VisitorCenaKolekcji v1 = new VisitorCenaKolekcji();
        VisitorCenaCzarnorynkowa v2 = new VisitorCenaCzarnorynkowa();
        VisitorWeterynarz v3 = new VisitorWeterynarz();

        for(Zwierze z : zwierzeta){
            z.akceptuj(v1);
            z.akceptuj(v2);
            z.akceptuj(v3);
        }

        v1.wypisz();
        v2.wypisz();



    }
}
