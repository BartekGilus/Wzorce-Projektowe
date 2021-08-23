package com.company;

import java.nio.file.FileSystemNotFoundException;

public class FileClosed implements FileState {

    private static FileClosed instance = null;
    private File context = null;

    public static FileState getInstance(){
        if(instance == null) instance = new FileClosed();
        return instance;
    }

    @Override
    public void Open() {
        System.out.println("Otwieram plik.");
        context.changeState(FileOpened.getInstance());
    }

    @Override
    public void Close() {
        System.out.println("Plik jest juz zamkniety.");
    }

    @Override
    public void Read() {
        System.out.println("Nie mozna czytac zamknietego pliku.");
    }

    @Override
    public void Write() {
        System.out.println("Nie mozna pisac w zamknietym pliku.");
    }

    @Override
    public void setContext(File c) {
        context = c;
    }
}
