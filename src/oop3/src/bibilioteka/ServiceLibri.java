package oop3.src.bibilioteka;

import oop3.src.bibilioteka.customExceptions.BibliotekaIsEmptyException;
import oop3.src.bibilioteka.customExceptions.BookNotAvailableException;
import oop3.src.bibilioteka.customExceptions.BookNotFoundException;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class ServiceLibri implements InterfaceLibri {

    @Override
    public void shtoLiber(Biblioteka biblioteka, Libri libri) {
        biblioteka.getLibrat().add(libri);
    }

    public void fshiLiber(Biblioteka biblioteka, Libri libri) throws BookNotFoundException {
        List<Libri> result = biblioteka.getLibrat();
        if (result != null && result.contains(libri)) {
            result.remove(libri);
        } else {
            throw new BookNotFoundException();
        }
    }


    //ë titullin, autorin ose ISBN e librit.
    public String kerkoLiberMeTitull(Biblioteka biblioteka, String titulli) throws BookNotFoundException {
        List<Libri> result = biblioteka.getLibrat();
        for (Libri l : result) {
            if (l.getTitulli().equals(titulli)) {
                return "Libri me titullin: " + titulli + " ndodhet ne biblioteke";

            }
        }
        throw new BookNotFoundException();
    }

    public String kerkoLiberMeAutor(Biblioteka biblioteka, String autori) throws BookNotFoundException {
        List<Libri> result = biblioteka.getLibrat();
        for (Libri l : result) {
            if (l.getAutori().equals(autori)) {
                return "Libri me autorin: " + autori + " ndodhet ne biblioteke";
            }
        }
        throw new BookNotFoundException();
    }

    public Libri kerkoLiberMeIsbn(Biblioteka biblioteka, String isbn) {
        List<Libri> result = biblioteka.getLibrat();
        for (Libri l : result) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;

    }

    public void shfaqLibrat(Biblioteka biblioteka) throws BibliotekaIsEmptyException {
        System.out.println("----------Librat ne Biblioteke----------");
        List<Libri> result = biblioteka.getLibrat();
        result.sort(Comparator.comparing(Libri::getTitulli));//to check
        if (result.isEmpty()) {
            throw new BibliotekaIsEmptyException();
        }
        for (Libri l : result) {
            System.out.println(l);
        }
    }

    @Override
    public void shfaqPerdoruesit(Biblioteka biblioteka) throws BibliotekaIsEmptyException {
        for (Perdoruesi p : biblioteka.getPerdoruesit()) {
            System.out.println(p);
        }
    }

    public String merrLiber(Biblioteka biblioteka, Perdoruesi perdoruesi, String isbn) throws BookNotFoundException, BookNotAvailableException {
        Libri liber = kerkoLiberMeIsbn(biblioteka, isbn);
        if (liber == null) {
            throw new BookNotFoundException();
        }
        if (liber.isRezervuar()) {
            throw new BookNotAvailableException();
        }


        liber.setRezervuar(true);
        liber.setIdPerdorues(perdoruesi.getId());
        return "Libri me ISBN: " + isbn + " u rezervua nga: " + perdoruesi.getEmer()
                + " me id: " + perdoruesi.getId();
    }

    public void ktheLiber(Biblioteka biblioteka, String isbn) {
        List<Libri> result = biblioteka.getLibrat();
        for (Libri libri : result) {
            if (libri.getIsbn().equals(isbn)) {
                libri.setRezervuar(false);
            }
        }
    }
}




