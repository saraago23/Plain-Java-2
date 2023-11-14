package oop3.src.bibilioteka;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Rezervim {

    private int id;
    private static int counter = 0;
    private Lexuesi lexuesi;
    private Libri libri;
    private LocalDateTime dataMarrjes;
    private LocalDateTime dataKthimit;

    public Rezervim() {
        id = counter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Rezervim.counter = counter;
    }

    public Lexuesi getLexuesi() {
        return lexuesi;
    }

    public void setLexuesi(Lexuesi lexuesi) {
        this.lexuesi = lexuesi;
    }

    public Libri getLibri() {
        return libri;
    }

    public void setLibri(Libri libri) {
        this.libri = libri;
    }

    public LocalDateTime getDataMarrjes() {
        return dataMarrjes;
    }

    public void setDataMarrjes(LocalDateTime dataMarrjes) {
        this.dataMarrjes = dataMarrjes;
    }

    public LocalDateTime getDataKthimit() {
        return dataKthimit;
    }

    public void setDataKthimit(LocalDateTime dataKthimit) {
        this.dataKthimit = dataKthimit;
    }
}
