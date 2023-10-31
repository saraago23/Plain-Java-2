package oop3.src.bibilioteka;

import java.util.Comparator;
import java.util.List;

public class ServiceLibri implements InterfaceLibri {

    @Override
    public void shtoLiber(Biblioteka biblioteka, Libri libri) {

        biblioteka.addLibri(libri);
    }


    public void fshiLiber(Biblioteka biblioteka, Libri libri) {
        List<Libri> result = biblioteka.getLibrat();
        if (result.contains(libri)) {
            result.remove(libri);
        } else {
            System.out.println("Ky liber nuk ndodhet ne biblioteke");
        }
    }

    //ë titullin, autorin ose ISBN e librit.
    public String kerkoLiberMeTitull(Biblioteka biblioteka, String titulli) {
        List<Libri> result = biblioteka.getLibrat();
        for (Libri l : result) {
            if (l.getTitulli().equals(titulli)) {
                return "Libri me titullin: " + titulli + " ndodhet ne biblioteke";

            }
        }
        return "Libri me titullin: " + titulli + " nuk ndodhet ne biblioteke";
    }

    public String kerkoLiberMeAutor(Biblioteka biblioteka, String autori) {
        List<Libri> result = biblioteka.getLibrat();
        for (Libri l : result) {
            if (l.getAutori().equals(autori)) {
                return "Libri me autorin: " + autori + " ndodhet ne biblioteke";
            }
        }
        return "Libri me autorin: " + autori + " nuk ndodhet ne biblioteke";
    }

    public boolean kerkoLiberMeIsbn(Biblioteka biblioteka, String isbn) {
        List<Libri> result = biblioteka.getLibrat();
        for (Libri l : result) {
            if (l.getIsbn().equals(isbn)) {
                return true;
            }
        }
        return false;
    }


    public void shfaqLibrat(Biblioteka biblioteka) {
        List<Libri> result = biblioteka.getLibrat();
        result.sort(Comparator.comparing(Libri::getTitulli));//to check
        System.out.println(result);
    }

    public String merrLiber(Biblioteka biblioteka, Perdoruesi perdoruesi, String isbn) {
        List<Libri> result = biblioteka.getLibrat();
        boolean ekzistonLibri = kerkoLiberMeIsbn(biblioteka, isbn);
        if (ekzistonLibri) {
            for (Libri libri : result) {
                if (libri.getIsbn().equals(isbn)) {
                    //result.remove(libri);
                    libri.setRezervuar(true);
                    libri.setIdPerdorues(perdoruesi.getId());
                    return "Libri me ISBN: " + isbn + " u rezervua nga: " + perdoruesi.getEmer()
                            + " me id: " + perdoruesi.getId();
                }
            }
        }
        return "Libri nuk ndodhet ne biblioteke";
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




