package oop3.src.bibilioteka;

import oop3.src.bibilioteka.customExceptions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

   /* public static void main(String[] args) {

        List<Libri> libra = gjeneroLibra();
        List<Lexuesi> perdorues = gjeneroPerdoruesa();

        Biblioteka biblioteka = new Biblioteka(libra, perdorues);
        InterfaceLibri service = new ServiceLibri();

        Autor autor= new Autor("Rhonda","Byrne");
        List<Autor> listLibri = new ArrayList<>();
        listLibri.add(autor);

        Libri liber = new Libri("Sekreti", listLibri, "978-99-9430-14-30", 2010);
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

    }*/

   /* public static List<Libri> gjeneroLibra() {
       Autor autor1= new Autor("Viktor","Hygo");
       List<Autor> listLibri1 = new ArrayList<>();
       listLibri1.add(autor1);
        Libri libri1 = new Libri

                ("I huaji", listLibri1 ,"978-92-95055-02-05", 1993);
        Autor autor2= new Autor("Danielle","Steel");
        List<Autor> listLibri2 = new ArrayList<>();
        Libri libri2 = new Libri
                ("Dhurata", listLibri2, "945-42-65765-17-89", 1994);

        List<Libri> librat = new ArrayList<>();
        librat.add(libri1);
        librat.add(libri2);
        return librat;
    }*/

    /*public static List<Lexuesi> gjeneroPerdoruesa() {

        Lexuesi lexuesi = new Lexuesi("Monika", "ago");
        Lexuesi lexuesi1 = new Lexuesi("sara", "ago");
        Lexuesi lexuesi2 = new Lexuesi("anisa", "rama");
        Lexuesi lexuesi3 = new Lexuesi("hena", "jonuzi");

        List<Lexuesi> perdoruesist = new ArrayList<>();
        perdoruesist.add(lexuesi);
        perdoruesist.add(lexuesi1);
        perdoruesist.add(lexuesi2);
        perdoruesist.add(lexuesi3);
        return perdoruesist;
    }*/

    public static void main(String[] args) {
        System.out.println("***********SISTEMI I BIBLIOTEKES**********");
        System.out.println("\t\t\t\tSherbimet: ");
        boolean vazhdo = true;
        Imenu serviceMenu = new ServiceMenu();

        do {
            System.out.println("1.SHTO LEXUES");
            System.out.println("2.FSHI LEXUES");
            System.out.println("3.SHTO LIBER");
            System.out.println("4.FSHI LIBER");
            System.out.println("5.MERR LIBER");
            System.out.println("6.KTHE LIBER");
            System.out.println("7.GJEJ LIBER");
            System.out.println("8.Personi qe ka lexuar me shume libra");
            System.out.println("9.Libri me i lexuar");
            System.out.println("10.Mesatarja e librave te lexuar per person");
            System.out.println("11.Lista e librave qe ka lexuar nje person");
            System.out.println("12.Lista e lexuesve te librit me nje titull te caktuar");
            System.out.println("13.Zhaneri me i lexuar");
            System.out.println("14.Librat per zhaner");
            System.out.println("15.Autori qe ka shkruar me shume libra");
            System.out.println("16.Autori me i lexuar");
            System.out.println("Cdo gje tjeter per te mbyllur aplikacionin!");

            System.out.println("Shtypni numrin per sherbimin qe deshironi te kryeni: ");
            Scanner scanner = new Scanner(System.in);
            String opsioniZgjedhur = scanner.next();

            switch (opsioniZgjedhur) {
                case "1":
                    System.out.println("Ju zgjodhet opsionin 1.SHTO LEXUES!");
                    serviceMenu.shtoLexues();
                    break;
                case "2":
                    System.out.println("Ju zgjodhet opsionin 2.FSHI LEXUES!");
                    serviceMenu.fshiLexues();
                    break;
                case "3":
                    System.out.println("Ju zgjodhet opsionin 3.SHTO LIBER!");
                    try {
                        serviceMenu.shtoLiber();
                    } catch (NotValidException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "4":
                    System.out.println("Ju zgjodhet opsionin 4.FSHI LIBER!");
                    try {
                        serviceMenu.fshiLiber();
                    } catch (BookNotFoundException | NotValidException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "5":
                    System.out.println("Ju zgjodhet opsionin 5.MERR LIBER!");
                    try {
                        serviceMenu.merrLiber();
                    } catch (BookNotFoundException | ReaderNotFoundException | NotValidException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "6":
                    System.out.println("Ju zgjodhet opsionin 6.KTHE LIBER!");
                    try {
                        serviceMenu.ktheLiber();
                    } catch (NotValidException | BookNotFoundException | ReaderNotFoundException |
                             ReservationNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "7":
                    System.out.println("Ju zgjodhet opsionin 7.GJEJ LIBER!");
                    try {
                        serviceMenu.gjejLiber();
                    } catch (NotValidException | BookNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "8":
                    System.out.println("Ju zgjodhet opsionin 8.Personi qe ka lexuar me shume libra!");
                    try {
                        serviceMenu.kthePersoninQeKaLexuarMeShumeLibra();
                    } catch (NotValidException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "9":
                    System.out.println("Ju zgjodhet opsionin 9.Libri me i lexuar!");
                    try {
                        serviceMenu.ktheLibrinMeTeLexuar();
                    } catch (NotValidException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "10":
                    System.out.println("Ju zgjodhet opsionin 10.Mesatarja e librave te lexuar per person!");
                    try {
                        serviceMenu.ktheMesatarenLibraveTeLexuarPerPerson();
                    } catch (NotValidException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case "11":
                    System.out.println("Ju zgjodhet opsionin 11.Lista e librave qe ka lexuar nje person!");
                    try {
                        serviceMenu.ktheLibratQeKaLexuarPersoni();
                    } catch (ReaderNotFoundException | BookNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "12":
                    System.out.println("Ju zgjodhet opsionin 12!");
                    break;
                case "13":
                    System.out.println("Ju zgjodhet opsionin 13!");
                    break;
                case "14":
                    System.out.println("Ju zgjodhet opsionin 14!");
                    break;
                case "15":
                    System.out.println("Ju zgjodhet opsionin 15!");
                    break;
                case "16":
                    System.out.println("Ju zgjodhet opsionin 16!");
                    break;
                default:
                    System.out.println("Faleminderit qe perdoret sherbimet tona!");
                    vazhdo = false;
                    break;

            }
        } while (vazhdo);
    }

}
