package oop3.src.bibilioteka;

import java.util.List;

public class Biblioteka {

    private List<Libri> librat;
    private List<Perdoruesi> perdoruesit;

    public Biblioteka(List<Libri> librat, List<Perdoruesi> perdoruesit) {
        this.librat = librat;
        this.perdoruesit = perdoruesit;
    }

    public List<Libri> getLibrat() {
        return librat;
    }

    public void setLibrat(List<Libri> librat) {
        this.librat = librat;
    }

    public List<Perdoruesi> getPerdoruesit() {
        return perdoruesit;
    }

    public void setPerdoruesit(List<Perdoruesi> perdoruesit) {
        this.perdoruesit = perdoruesit;
    }
}
