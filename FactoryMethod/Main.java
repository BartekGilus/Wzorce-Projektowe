package com.company;

public class Main {

    public static void main(String[] args) {
	    String zapytanie = "SELECT * FROM tabela";
	    SzablonZapyania z1 = new ZapytanieSQLServer();
        BazaDanych db1 = z1.utworzBD();
        db1.Połącz();
        db1.WykonajZapytanie(z1.formatujSelect(zapytanie));

        SzablonZapyania z2 = new ZapytanieOracle();
        BazaDanych db2 = z2.utworzBD();
        db2.Połącz();
        db2.WykonajZapytanie(z2.formatujSelect(zapytanie));
    }
}
