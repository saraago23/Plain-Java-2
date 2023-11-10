package oop3.src.bibilioteka;

import oop3.src.bibilioteka.customExceptions.BibliotekaIsEmptyException;
import oop3.src.bibilioteka.customExceptions.BookNotAvailableException;
import oop3.src.bibilioteka.customExceptions.BookNotFoundException;

import java.io.IOException;

public interface InterfaceLibri {

    void shtoLiber(Biblioteka biblioteka, Libri libri);

    void fshiLiber(Biblioteka biblioteka, Libri libri) throws BookNotFoundException;

    String kerkoLiberMeTitull(Biblioteka biblioteka, String titulli) throws BookNotFoundException;

    String kerkoLiberMeAutor(Biblioteka biblioteka, String autori) throws BookNotFoundException;

    Libri kerkoLiberMeIsbn(Biblioteka biblioteka, String isbn);

    void shfaqLibrat(Biblioteka biblioteka) throws BibliotekaIsEmptyException;

    void shfaqPerdoruesit(Biblioteka biblioteka) throws BibliotekaIsEmptyException;

    String merrLiber(Biblioteka biblioteka, Perdoruesi perdoruesi, String isbn) throws BookNotFoundException, BookNotAvailableException;

    void ktheLiber(Biblioteka biblioteka, String isbn);
}
