package com.company;

public class Vector2D extends Vector3D {

    public Vector2D(double x, double y){
        super(x, y, 0);
    }

    public Vector2D dodaj(Vector2D v){
        return new Vector2D(this.x + v.x, this.y + v.y);
    }

    public void wypisz(){
        System.out.print(this.x + " ");
        System.out.print(this.y + "\n");
    }
}
