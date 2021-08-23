package com.company;

public class Ssak extends Zwierze {

    public Ssak(double c, boolean z, double cenaCz) {
        super(c, z, cenaCz, "Ssak");
    }

    @Override
    public void akceptuj(Visitor v) {
        v.VisitSsak(this);
    }
}
