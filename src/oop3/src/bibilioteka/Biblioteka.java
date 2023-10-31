package oop3.src.bibilioteka;

import java.util.List;

public class Biblioteka extends ServiceLibri {

    private List<Libri> librat;
    private List<Perdoruesi> perdorues;

    public Biblioteka(List<Libri> librat){
        this.librat=librat;
    }

    public List<Libri> getLibrat() {
        return librat;
    }

    public void setLibrat(List<Libri> librat) {
        this.librat = librat;
    }

    public void addLibri(Libri libri){
        this.librat.add(libri);
    }

    @Override
    public String toString() {
        return "Biblioteka{" +
                "librat=" + librat ;
    }
}
