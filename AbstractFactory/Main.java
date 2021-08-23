package com.company;

public class Main {

    public static void main(String[] args) {
	    Konfiguracja config = new Konfiguracja();
	    ApNadzorujaca niskaRozdzielczosc = new ApNadzorujaca(config.niskaRoz());
	    ApNadzorujaca wysokaRozdzielczosc = new ApNadzorujaca(config.wysokaRoz());

	    niskaRozdzielczosc.Start();
	    wysokaRozdzielczosc.Start();
    }
}
