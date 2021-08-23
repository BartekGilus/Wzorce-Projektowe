package com.company;

public class ConcreteObserver  implements Observer{

    private ConcreteSubject subject;
    private States observerCurrentState;

    public ConcreteObserver(ConcreteSubject s){
        this.subject = s;
        this.subject.Attach(this);
    }

    @Override
    public void update() {
        this.observerCurrentState = subject.getState();
        System.out.println("Zmiana stanu na :" + this.observerCurrentState);
    }
}
