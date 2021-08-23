package com.company;

public class Konfiguracja {

    public FabrykaSter niskaRoz(){
        return new FabrykaNisRozdz();
    }

    public FabrykaSter wysokaRoz(){
        return new FabrykaWysRozdz();
    }
}
