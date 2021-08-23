package com.company;

public class FileOpened implements FileState {

    private static FileOpened instance = null;
    private File context = null;

    public static FileState getInstance(){
        if(instance == null) instance = new FileOpened();
        return instance;
    }

    @Override
    public void Open() {
        System.out.println("Plik jest juz otwarty.");
    }

    @Override
    public void Close() {
        System.out.println("Zamykam plik.");
        context.changeState(FileClosed.getInstance());
    }

    @Override
    public void Read() {
        System.out.println("Odczytuje z pliku.");
    }

    @Override
    public void Write() {
        System.out.println("Zapisuje do pliku.");
    }

    @Override
    public void setContext(File c) {
        context = c;
    }
}
