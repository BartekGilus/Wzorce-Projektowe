package com.company;

public class Main {

    public static void main(String[] args) {
        String zap = "SELECT * FROM Baza";
        SzablonZapyania zap1 = new ZapytanieSQLServer();
        zap1.WykonajZapytanie("Harry", zap);

        System.out.print(" \n");

        SzablonZapyania zap2 = new ZapytanieOracle();
        zap2.WykonajZapytanie("Potter", zap);
    }
}
