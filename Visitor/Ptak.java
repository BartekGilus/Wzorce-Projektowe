package com.company;

public class Ptak extends Zwierze {

    public Ptak(double c, boolean z, double cenaCz) {
        super(c, z, cenaCz , "Ptak");
    }

    @Override
    public void akceptuj(Visitor v) {
        v.VisitPtak(this);
    }
}
