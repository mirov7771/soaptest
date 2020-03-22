package ru.amirov.test;

public class ScannerException extends Exception {

    private static final String WRONG_NUMBER = "Wrong number in";

    public ScannerException(){
        super(WRONG_NUMBER);
    }

    public ScannerException(String message){
        super(message);
    }

}
