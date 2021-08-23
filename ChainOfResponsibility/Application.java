package com.company;

public class Application extends Konfiguracja {

    protected Application(){

    }

    protected Application(Konfiguracja h) {
        super(h);
    }

    @Override
    public void HandleHelp() {
        ShowHelp();
    }

    @Override
    public void ShowHelp() {
        System.out.println(this.getClass() + ": Odebralem żądanie wyswietlenia pomocy");
    }
}
