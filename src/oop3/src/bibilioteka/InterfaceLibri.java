package oop3.src.bibilioteka;

public interface InterfaceLibri {

    public void shtoLiber(Biblioteka biblioteka, Libri libri);
    public void fshiLiber(Biblioteka biblioteka, Libri libri);
    public String kerkoLiberMeTitull(Biblioteka biblioteka, String titulli);
    public String kerkoLiberMeAutor(Biblioteka biblioteka, String autori);
    public boolean kerkoLiberMeIsbn(Biblioteka biblioteka, String isbn);
    public void shfaqLibrat(Biblioteka biblioteka);
    public String merrLiber(Biblioteka biblioteka, Perdoruesi perdoruesi, String isbn);
    //public void ktheLiber(Biblioteka biblioteka, String isbn);
}
