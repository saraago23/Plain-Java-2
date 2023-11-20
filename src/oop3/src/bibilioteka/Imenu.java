package oop3.src.bibilioteka;

import oop3.src.bibilioteka.customExceptions.*;

import java.util.List;

public interface Imenu {

    void shtoLexues();

    void fshiLexues();

    void shtoLiber() throws NotValidException;

    void fshiLiber() throws BookNotFoundException, NotValidException;

    void merrLiber() throws BookNotFoundException, ReaderNotFoundException, NotValidException;

    void ktheLiber() throws NotValidException, BookNotFoundException, ReaderNotFoundException, ReservationNotFoundException;

    void gjejLiber() throws NotValidException, BookNotFoundException;

    void kthePersoninQeKaLexuarMeShumeLibra() throws NotValidException;

    void ktheLibrinMeTeLexuar() throws NotValidException;

    void ktheMesatarenLibraveTeLexuarPerPerson() throws NotValidException;

    void ktheLibratQeKaLexuarPersoni() throws ReaderNotFoundException, BookNotFoundException;

    void ktheLexuesitElibrit();

    void ktheZhanerinMeTeLexuar() throws ReaderNotFoundException, ReservationNotFoundException;

    void ktheLibratPerZhaner() throws BookNotFoundException;

    void ktheAutorinQeKaShkruarMeShumeLibra() throws BookNotFoundException;

    void ktheAutorinMeTeLexuar() throws BookNotFoundException;

    void shfaqLibrat() throws BibliotekaIsEmptyException, BookNotFoundException;

    void shfaqPerdoruesit() throws BibliotekaIsEmptyException, ReaderNotFoundException;

}




