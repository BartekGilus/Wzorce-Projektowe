package com.company;

public class DialogMediator implements Mediator {

    private ComponentX c1, c2, c3;

    public DialogMediator(ComponentX c1, ComponentX c2, ComponentX c3){
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    @Override
    public void zaznacz(int x) {
        switch(x){
            case 1:
                if(!c1.Checked) c1.Checked = true;
                else c1.Checked = c2.Checked = c3.Checked = false;
                return;
            case 2:
                if(!c2.Checked) c1.Checked = c2.Checked = true;
                else c2.Checked = c3.Checked = false;
                return;
            case 3:
                if(!c3.Checked) c1.Checked = c2.Checked = c3.Checked = true;
                else c3.Checked = false;
                return;

        }
    }

}
