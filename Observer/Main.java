package com.company;

public class Main {

    public static void main(String[] args) {
	    ConcreteSubject s1 = new ConcreteSubject();

	    Observer o1 = new ConcreteObserver(s1);
        Observer o2 = new ConcreteObserver(s1);
        s1.setState(States.StateA);
        s1.setState(States.StateB);
    }
}
