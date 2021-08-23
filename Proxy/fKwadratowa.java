package com.company;

public class fKwadratowa {

    private double a, b, c;
    private Wynik w = new Wynik();
    private fKProxy fkp;

    public fKwadratowa(){

    }

    public Wynik licz(double a, double b, double c){
        if((this.a == a) && (this.b == b) && (this.c == c)){
            System.out.println("Wypisane przy pomocy proxy: ");
            return fkp.getW();
        }
        else{
            this.a = a;
            this.b = b;
            this.c = c;
            double delta = b * b - 4 * a * c;
            w.x1 = (-1 * b - Math.sqrt(delta)) / 2 * a;
            w.x2 = (-1 * b + Math.sqrt(delta)) / 2 * a;
            fkp = new fKProxy(w);
            return w;
        }
    }

}
