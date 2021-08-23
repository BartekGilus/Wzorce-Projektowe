package com.company;

public class Component {

    protected Mediator mediator = null;

    public Component(){

    }

    public Component(Mediator m){
        this.mediator = m;
    }

    public void setMediator(Mediator m){
        mediator = m;
    }
}
