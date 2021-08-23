package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        ComponentX c1 = new ComponentX(1, "Cwiczenia Zaliczone.");
        ComponentX c2 = new ComponentX(2, "Wyklad Zaliczony.");
        ComponentX c3 = new ComponentX(3, "Przedmiot Zaliczony.");

        Mediator m1 = new DialogMediator(c1, c2, c3);

        c1.setMediator(m1);
        c2.setMediator(m1);
        c3.setMediator(m1);

        while((isRunning)){
            System.out.println("1. "+ c1.status());
            System.out.println("2. "+ c2.status());
            System.out.println("3. "+ c3.status());
            System.out.println("4. Wyjdz");
            System.out.print("Wybierz opcje: ");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    c1.Sprawdz();
                    break;
                case 2:
                    c2.Sprawdz();
                    break;
                case 3:
                    c3.Sprawdz();
                    break;
                case 4:
                    isRunning = false;
            }
        }

    }
}
