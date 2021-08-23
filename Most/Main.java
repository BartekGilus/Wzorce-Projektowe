package com.company;

public class Main {

    public static void main(String[] args) {
	    Biblioteka b1 = new BibliotekaV1();
        Biblioteka b2 = new BibliotekaV2();

        Figura f1 = new Okrag(b1);
        Figura f2 = new Prostokat(b2);

        f1.rysujOkrag();
        f2.rysujLinie();
    }
}
