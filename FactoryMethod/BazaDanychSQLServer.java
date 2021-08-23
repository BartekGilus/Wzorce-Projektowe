package com.company;

public class BazaDanychSQLServer extends BazaDanych {
    @Override
    public void Połącz() {
        System.out.println("Połączono z baza danych SQL Server");
    }

    @Override
    public void WykonajZapytanie(String z) {
        System.out.println("Wykonano zapytanie do bazy danych SQL Server: "+ z);
    }
}
