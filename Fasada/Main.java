package com.company;

public class Main {

    public static void main(String[] args) {
	    Vector3D v1 = new Vector3D(3,4,5);
        Vector3D v2 = new Vector3D(3,4,5);

        v2.wypisz();
	    v2 = v2.dodaj(v1);
	    v2.wypisz();

        Vector2D v3 = new Vector2D(1,2);
        Vector2D v4 = new Vector2D(1,2);

        v3.wypisz();
        v4 = v4.dodaj(v3);
        v4.wypisz();
    }
}
