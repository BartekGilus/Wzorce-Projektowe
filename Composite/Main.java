package com.company;

public class Main {

    public static void main(String[] args) {
	    Grafika g = new Obraz();
		Obraz o = new Obraz();
	    g.Add(new Prostokat());
	    o.Add(new Linia());
	    o.Add(new Text());
	    g.Add(o);
	    g.Draw();

	    g.Remove(o);
		g.Draw();
    }
}
