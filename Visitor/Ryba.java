package com.company;

public class Ryba extends Zwierze {


    public Ryba(double c, boolean z, double cenaCz ) {
        super(c, z, cenaCz,"Ryba");
    }

    @Override
    public void akceptuj(Visitor v) {
        v.VisitRyba(this);
    }
}
