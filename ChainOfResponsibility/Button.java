package com.company;

public class Button extends Konfiguracja {

    protected Button(){

    }

    protected Button(Konfiguracja h) {
        super(h);
    }

    @Override
    public void HandleHelp() {
        System.out.println(this.getClass() + ": Nie potrafie obsluzyc żądania i przekazuje je dalej");
        successor.HandleHelp();
    }

    @Override
    public void ShowHelp() {

    }
}
