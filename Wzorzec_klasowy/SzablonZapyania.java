package com.company;

public abstract class SzablonZapyania {

    public void WykonajZapytanie(String baza, String zapytanie){
        System.out.print(formatujConnect(baza));
        System.out.print(formatujSelect(zapytanie));
    }

    protected abstract String formatujConnect(String baza);
    protected abstract String formatujSelect(String zapytanie);
}
