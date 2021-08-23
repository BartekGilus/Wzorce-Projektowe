package com.company;

public class Singleton {

    private static Singleton instance = null;

    private Singleton(){
        System.out.println("Tworze instancje");
    }

    public static Singleton getInstance(){
        if(instance == null) instance = new Singleton();
        return instance;
    }

    public void Talk(){
        System.out.println("Mowie");
    }
}

