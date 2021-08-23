package com.company;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private List<Observer> observers;
    private States currentState = States.Default;

    public ConcreteSubject(){
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void Attach(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void Detach(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void Notify() {
        for(Observer o: observers){
            o.update();
        }
    }

    public States getState(){
        return this.currentState;
    }

    public void setState(States s){
        this.currentState = s;
        Notify();
    }
}
