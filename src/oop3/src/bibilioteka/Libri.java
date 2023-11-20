package oop3.src.bibilioteka;

import java.util.List;

public class Libri {

    private int id;
    private static int counter = 0;
    private int idPerdorues;
    private String titulli;
    private List<Autor> autoret;
    private String isbn;
    private int vitiBotimit;
    private Zhaner zhaneriLibrit;
    private boolean rezervuar;

    public Libri(String titulli, List<Autor> autoret, String isbn, int vitiBotimit, Zhaner zhaneriLibrit) {
        this.id = counter++;
        this.titulli = titulli;
        this.autoret = autoret;
        this.isbn = isbn;
        this.vitiBotimit = vitiBotimit;
        this.zhaneriLibrit=zhaneriLibrit;
    }

    public String getTitulli() {
        return titulli;
    }

    public void setTitulli(String titulli) {
        this.titulli = titulli;
    }

    public List<Autor> getAutoret() {
        return autoret;
    }

    public void setAutoret(List<Autor> autoret) {
        this.autoret = autoret;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getVitiBotimit() {
        return vitiBotimit;
    }

    public void setVitiBotimit(int vitiBotimit) {
        this.vitiBotimit = vitiBotimit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPerdorues() {
        return idPerdorues;
    }

    public void setIdPerdorues(int idPerdorues) {
        this.idPerdorues = idPerdorues;
    }

    public boolean isRezervuar() {
        return rezervuar;
    }

    public void setRezervuar(boolean rezervuar) {
        this.rezervuar = rezervuar;
    }

    public Zhaner getZhaneriLibrit() {
        return zhaneriLibrit;
    }

    public void setZhaneriLibrit(Zhaner zhaneriLibrit) {
        this.zhaneriLibrit = zhaneriLibrit;
    }

    @Override
    public String toString() {
        return id + " - " + titulli + " ( " + getAutoret() + ") ISBN: " + isbn + " " + (rezervuar ? "Rezervuar" : "I disponueshem");
    }
}
