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

    List<Libri> ktheLexuesitElibrit(String titulliLibrit);

    Zhaner ktheZhanerinMeTeLexuar(Biblioteka biblioteka);

    List<Libri> ktheLibratPerZhaner(Zhaner zhaner);

    Autor ktheAutorinQeKaShkruarMeShumeLibra(Biblioteka biblioteka);

    Autor ktheAutorinMeTeLexuar(Biblioteka biblioteka);

    void shfaqLibrat(Biblioteka biblioteka) throws BibliotekaIsEmptyException;

    void shfaqPerdoruesit(Biblioteka biblioteka) throws BibliotekaIsEmptyException;

}




