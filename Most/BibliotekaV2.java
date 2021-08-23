package com.company;

public class BibliotekaV2 extends Biblioteka {

    private BG2 bg = new BG2();

    @Override
    public void rysujLinie() {
        bg.rysujLinie();
    }

    @Override
    public void rysujOkrag() {
        bg.rysujOkrag();
    }
}
