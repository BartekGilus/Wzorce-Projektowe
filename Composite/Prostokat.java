package com.company;

public class Prostokat implements Grafika {
    @Override
    public void Draw() {
        System.out.println("Rysuje Prostokat");
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
