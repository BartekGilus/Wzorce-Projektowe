package com.company;

public interface Grafika {

    void Draw();
    void Add(Grafika g);
    void Remove(Grafika g);
    Grafika GetChild(int i);
}
