package com.company;

import java.util.ArrayList;
import java.util.List;

public class Obraz implements Grafika {

    private List<Grafika> g;

    public Obraz(){
        this.g = new ArrayList<Grafika>();
    }

    @Override
    public void Draw() {
        for(Grafika g: g) g.Draw();
    }

    @Override
    public void Add(Grafika g) {
        this.g.add(g);
    }

    @Override
    public void Remove(Grafika g) {
        this.g.remove(g);
    }

    @Override
    public Grafika GetChild(int i) {
        return g.get(i);
    }

}
