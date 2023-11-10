package oop3.src.bibilioteka;

public class Libri {

    private int id;
    private static int counter = 0;
    private int idPerdorues;
    private String titulli;
    private String autori;
    private String isbn;
    private int vitiBotimit;
    boolean rezervuar;

    public Libri(String titulli, String autori, String isbn, int vitiBotimit) {
        this.id = counter++;
        this.titulli = titulli;
        this.autori = autori;
        this.isbn = isbn;
        this.vitiBotimit = vitiBotimit;
    }

    public String getTitulli() {
        return titulli;
    }

    public void setTitulli(String titulli) {
        this.titulli = titulli;
    }

    public String getAutori() {
        return autori;
    }

    public void setAutori(String autori) {
        this.autori = autori;
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


    @Override
    public String toString() {
        return "Libri: " + id + " - " + titulli + " ( " + autori + ") ISBN: " + isbn + " " + (rezervuar ? "Rezervuar" : "I disponueshem");
    }
}
