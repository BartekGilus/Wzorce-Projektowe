package com.company;

public class Main {

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 0, 2, 0, 10, 5, 0, 0, 13};

        Iter iterator = new Iter(tab);
        iterator.First();

        while(iterator.isDone()){
            System.out.println(iterator.currentItem());
            iterator.Next();
        }

        System.out.println("\n\n");

        IterWithoutZero iteratorNoZeros = new IterWithoutZero(tab);
        iteratorNoZeros.First();

        while(iteratorNoZeros.isDone()){
            System.out.println(iteratorNoZeros.currentItem());
            iteratorNoZeros.Next();
        }
    }
}
