package com.company;

public class BibliotekaV1 extends Biblioteka{

    private BG1 bg = new BG1();

    @Override
    public void rysujLinie() {
        bg.rysujLinie();
    }

    @Override
    public void rysujOkrag() {
        bg.rysujOkrag();
    }
}
