package oop3.src.bibilioteka;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {

    private List<Libri> librat=new ArrayList<>();
    private List<Lexuesi> lexuesit=new ArrayList<>();
    private List<Rezervim> rezervimet=new ArrayList<>();

    public List<Libri> getLibrat() {
        return librat;
    }

    public List<Lexuesi> getLexuesit() {
        return lexuesit;
    }

    public List<Rezervim> getRezervimet() {
        return rezervimet;
    }

}
