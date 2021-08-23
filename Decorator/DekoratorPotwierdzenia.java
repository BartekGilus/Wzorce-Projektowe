package com.company;

public class DekoratorPotwierdzenia implements Komponent {

    private Komponent mojKomponent;

    public DekoratorPotwierdzenia(Komponent mk){
        this.mojKomponent = mk;
    }

    @Override
    public void drukuj() {
        mojKomponent.drukuj();
    }
}
