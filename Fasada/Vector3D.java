package com.company;

public class Vector3D {
    protected double x, y, z;

    public Vector3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D dodaj(Vector3D v){
        return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    public void wypisz(){
        System.out.print(this.x + " ");
        System.out.print(this.y + " ");
        System.out.print(this.z + "\n");
    }
}
