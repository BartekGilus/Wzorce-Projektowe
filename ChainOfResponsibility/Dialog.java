package com.company;

public class Dialog extends Konfiguracja {

    protected Dialog(){

    }

    public Dialog(Konfiguracja h){
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
