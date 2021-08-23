package com.company;

public class Linia implements Grafika {
    @Override
    public void Draw() {
        System.out.println("Rysuje Linie");
    }

    @Override
    public void Add(Grafika g) {

    }

    @Override
    public void Remove(Grafika g) {

    }

    @Override
    public Grafika GetChild(int i) {
        return null;
    }
}
