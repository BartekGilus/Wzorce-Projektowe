package com.company;

public class IterWithoutZero extends Iter {

    public IterWithoutZero(int tab[]){
        super(tab);
    }

    public int currentItem(){
        while(tab[item] == 0){
            this.Next();
        }
        return tab[this.item];
    }
}
