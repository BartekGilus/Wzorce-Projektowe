package com.company;

public class Figura {

    private Biblioteka b;

    public Figura(Biblioteka bg){
        this.b = bg;
    }

    protected void rysujLinie(){
        b.rysujLinie();
    }

    protected void rysujOkrag(){
        b.rysujOkrag();
    }
}
