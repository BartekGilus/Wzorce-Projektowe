package com.company;

public class Main {

    public static void main(String[] args) {
	    Singleton s1 = Singleton.getInstance();
	    s1.Talk();
        Singleton s2 = Singleton.getInstance();
        s2.Talk();
        Singleton s3 = Singleton.getInstance();
        s3.Talk();
    }
}
