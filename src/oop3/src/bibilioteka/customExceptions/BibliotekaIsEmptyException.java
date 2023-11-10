package oop3.src.bibilioteka.customExceptions;

public class BibliotekaIsEmptyException extends Exception{
    public BibliotekaIsEmptyException() {
        super("Biblioteka eshte bosh!");
    }
}
