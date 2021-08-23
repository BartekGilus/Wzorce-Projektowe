package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Figura> figury = new ArrayList<Figura>();

        figury.add(new Linia());
        figury.add(new Punkt());
        figury.add(new Kwadrat());
        figury.add(new Okrag());

        for (Figura f: figury) {
            f.wyswietl();
        }
    }
}
