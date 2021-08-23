package com.company;

public abstract class Konfiguracja {

    protected Konfiguracja successor;

    protected Konfiguracja(){
        successor = null;
    }

    protected Konfiguracja(Konfiguracja h){
        this.successor = h;
    }

    protected void setNext(Konfiguracja h){
        this.successor = h;
    }

    public abstract void HandleHelp();
    public abstract void ShowHelp();
}
