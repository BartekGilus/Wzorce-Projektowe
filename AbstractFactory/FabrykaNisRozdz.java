package com.company;

public class FabrykaNisRozdz extends FabrykaSter {
    @Override
    public SterownikEkranu pobierzSterEkrn() {
        return new SterEkrnNisRozdz();
    }

    @Override
    public SterownikDrukarki pobierzSterDrul() {
        return new SterDrukNisRozdz();
    }
}
