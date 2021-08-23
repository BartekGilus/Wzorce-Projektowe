package com.company;

public class Main {

    public static void main(String[] args) {
	    Application anApplication = new Application();
	    Dialog aSaveDialog = new Dialog();
        Dialog aPrintDialog = new Dialog();
        Button aPrintButton = new Button();
        Button aOKButton = new Button();

        aOKButton.setNext(aSaveDialog);
        aPrintButton.setNext(aPrintDialog);
        aPrintDialog.setNext(anApplication);
        aSaveDialog.setNext(anApplication);

        aOKButton.HandleHelp();
        aSaveDialog.HandleHelp();
    }
}
