package oop3.src.bibilioteka;

import oop3.src.bibilioteka.customExceptions.BibliotekaIsEmptyException;
import oop3.src.bibilioteka.customExceptions.BookNotAvailableException;
import oop3.src.bibilioteka.customExceptions.BookNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {

        List<Libri> libra = gjeneroLibra();
        List<Perdoruesi> perdorues = gjeneroPerdoruesa();

        Biblioteka biblioteka = new Biblioteka(libra, perdorues);
        InterfaceLibri service = new ServiceLibri();

        Libri liber = new Libri("Sekreti", "Rhonda Byrne", "978-99-9430-14-30", 2010);
        service.shtoLiber(biblioteka, liber);

        try {
            service.shfaqLibrat(biblioteka);
        } catch (BibliotekaIsEmptyException e) {
            System.out.println(e.getMessage());
        }

        try {
            service.fshiLiber(biblioteka, liber);
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            service.shfaqLibrat(biblioteka);
        } catch (BibliotekaIsEmptyException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(service.kerkoLiberMeTitull(biblioteka, "I huaji"));
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage() + " Titulli I huaji");
        }

        try {
            System.out.println(service.kerkoLiberMeAutor(biblioteka, "Danielle Steel"));
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(service.kerkoLiberMeIsbn(biblioteka, "978-69-9430-14-30"));

        try {
            service.shfaqLibrat(biblioteka);
        } catch (BibliotekaIsEmptyException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(service.merrLiber(biblioteka, perdorues.get(0), "945-42-65765-17-89"));
        } catch (BookNotFoundException | BookNotAvailableException e) {
            System.out.println(e.getMessage() + " Isbn: 945-42-65765-17-89");
        }

        try {
            System.out.println(service.merrLiber(biblioteka, perdorues.get(0), "978-99-9430-14-30"));
        } catch (BookNotFoundException | BookNotAvailableException e) {
            System.out.println(e.getMessage() + " ISBN: 978-99-9430-14-30");
        }

        try {
            System.out.println(service.merrLiber(biblioteka, perdorues.get(1), "945-42-65765-17-89"));
        } catch (BookNotFoundException | BookNotAvailableException e) {
            System.out.println(e.getMessage() + " Isbn: 945-42-65765-17-89");
        }

        try {
            service.shfaqLibrat(biblioteka);
        } catch (BibliotekaIsEmptyException e) {
            System.out.println(e.getMessage());
        }

        service.ktheLiber(biblioteka, "945-42-65765-17-89");
        System.out.println(biblioteka);

    }

    public static List<Libri> gjeneroLibra() {
        Libri libri1 = new Libri
                ("I huaji", "Viktor Hygo", "978-92-95055-02-05", 1993);
        Libri libri2 = new Libri
                ("Dhurata", "Danielle Steel", "945-42-65765-17-89", 1994);

        List<Libri> librat = new ArrayList<>();
        librat.add(libri1);
        librat.add(libri2);
        return librat;
    }

    public static List<Perdoruesi> gjeneroPerdoruesa() {

        Perdoruesi perdoruesi = new Perdoruesi("Monika", "ago");
        Perdoruesi perdoruesi1 = new Perdoruesi("sara", "ago");
        Perdoruesi perdoruesi2 = new Perdoruesi("anisa", "rama");
        Perdoruesi perdoruesi3 = new Perdoruesi("hena", "jonuzi");

        List<Perdoruesi> perdoruesist = new ArrayList<>();
        perdoruesist.add(perdoruesi);
        perdoruesist.add(perdoruesi1);
        perdoruesist.add(perdoruesi2);
        perdoruesist.add(perdoruesi3);
        return perdoruesist;
    }

}
