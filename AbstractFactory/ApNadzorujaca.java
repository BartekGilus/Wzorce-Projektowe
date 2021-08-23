package com.company;

public class ApNadzorujaca {
    private FabrykaSter fabryka;

    public ApNadzorujaca(FabrykaSter f){
        this.fabryka = f;
    }

    public void Start(){
        SterownikEkranu SterEk = fabryka.pobierzSterEkrn();
        SterownikDrukarki SterDr = fabryka.pobierzSterDrul();
        SterEk.rysuj();
        SterDr.drukuj();
    }

}
