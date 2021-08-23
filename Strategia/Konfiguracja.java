package com.company;

public class Konfiguracja {

    private kraje kraj;

    public Konfiguracja(kraje kraj){
        this.kraj = kraj;
    }

    public obliczPodatek returnKraj(){
        if(kraj == kraje.POLSKA)
            return new podatekPolska();
        else if(kraj == kraje.NIEMCY)
            return new podatekNiemcy();

        return new podatekPolska();
    }

}
