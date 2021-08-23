package com.company;

public class File {

    private FileState state;

    public File(){
        state = FileClosed.getInstance();
        state.setContext(this);
    }

    public void Open()
    {
        state.Open();
    }

    public void Close()
    {
        state.Close();
    }

    public void Read()
    {
        state.Read();
    }

    public void Write()
    {
        state.Write();
    }

    public void changeState(FileState s){
        state = s;
        state.setContext(this);
    }
}
