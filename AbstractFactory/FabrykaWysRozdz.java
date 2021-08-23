package com.company;

public class FabrykaWysRozdz extends FabrykaSter {
    @Override
    public SterownikEkranu pobierzSterEkrn() {
        return new SterEkrnWysRozdz();
    }

    @Override
    public SterownikDrukarki pobierzSterDrul() {
        return new SterDrukWysRozdz();
    }
}
