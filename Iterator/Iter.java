package com.company;

public class Iter {
    protected int item = 0;
    protected int tab[];

    public Iter(int tab[]){
        this.tab = tab;
    }

    public void First(){
        this.item = 0;
    }

    public void Next(){
        this.item += 1;
    }

    public int currentItem(){
        return tab[this.item];
    }

    public boolean isDone(){
        if(item >= tab.length) return false;

        return true;
    }
}
