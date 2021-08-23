package com.company;

public class Main {

    public static void main(String[] args) {
	 double[] ceny = {3.4, 2.1, 6.2, 2.5, 6.9};

	 Zamowienie z1 = new Zamowienie(ceny, kraje.POLSKA);
	 System.out.printf("%.2f \n", z1.licz());

	 Zamowienie z2 = new Zamowienie(ceny, kraje.NIEMCY);
	 System.out.printf("%.2f", z2.licz());
    }
}
