package com.company;

public class ZapytanieSQLServer extends SzablonZapyania {

    @Override
    protected String formatujConnect(String baza) {
        return "Baza SQLServer: " + baza + "\t";
    }

    @Override
    protected String formatujSelect(String zapytanie) {
        return zapytanie;
    }

    @Override
    public BazaDanych utworzBD() {
        return new BazaDanychSQLServer();
    }


}
