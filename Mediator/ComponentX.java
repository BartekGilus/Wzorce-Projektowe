package com.company;

public class ComponentX extends Component {
    public boolean Checked;
    public int x;
    public String opis;

    public ComponentX(int x, String opis){
        super();
        this.x = x;
        this. opis = opis;
        this.Checked = false;
    }

    public void Sprawdz(){
        mediator.zaznacz(x);
    }

    public String status(){
        return opis+" "+(Checked ? "X" : " ");
    }

}
