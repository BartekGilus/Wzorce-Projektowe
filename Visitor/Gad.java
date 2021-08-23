package com.company;

public class Gad extends Zwierze {

    public Gad(double c, boolean z, double cenaCz) {
        super(c, z, cenaCz, "Gad");
    }

    @Override
    public void akceptuj(Visitor v) {
        v.VisitGady(this);
    }
}
