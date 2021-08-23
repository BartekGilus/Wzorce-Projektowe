package com.company;

public class Okrag extends Figura {

    private XXOkrag xxOkrag;

    public Okrag()
    {
        xxOkrag = new XXOkrag();
    }

    public void pobierzPolozenie()
    {
        xxOkrag.pobierzPolozenie();
    }
    public void nadajPolozenie()
    {
        xxOkrag.nadajPolozenie();
    }
    public void wyswietl()
    {
        xxOkrag.wyswietlaj();
    }
    public void wypelnij()
    {
        xxOkrag.wypelniaj();
    }
    public void nadajKolor()
    {
        xxOkrag.ustawKolor();
    }
    public void usun()
    {
        xxOkrag.usuwaj();
    }
}
