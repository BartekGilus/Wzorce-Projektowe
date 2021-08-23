package com.company;

public interface FileState {
    void Open();
    void Close();
    void Read();
    void Write();
    void setContext(File c);
}
