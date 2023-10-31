package oop3.src.bibilioteka;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //krijoj librat per ti vendosur ne biblioteke
        Libri libri1 = new Libri
                ("I huaji", "Viktor Hygo", "978-92-95055-02-05", 1993);
        Libri libri2 = new Libri
                ("Dhurata", "Danielle Steel", "945-42-65765-17-89", 1994);

        //vendosja e librave ne biblioteke
        List<Libri> librat = new ArrayList<>();
        librat.add(libri1);
        librat.add(libri2);
        Biblioteka biblioteka = new Biblioteka(librat);
        System.out.println(biblioteka);

        Libri libri3= new Libri("Sekreti", "Rhonda Byrne", "978-99-9430-14-30", 2010);

        //shtoj nje liber
        biblioteka.shtoLiber(biblioteka,libri3);

        System.out.println(biblioteka);

        //fshij nje liber nga biblioteka

        biblioteka.fshiLiber(biblioteka,libri1);
        System.out.println(biblioteka);

        //kerkoj liber me ane te titullit
        System.out.println(biblioteka.kerkoLiberMeTitull(biblioteka,"I huaji"));

        //kerkoj liber me ane te autorit
        System.out.println(biblioteka.kerkoLiberMeAutor(biblioteka,"Danielle Steel"));

        //kerkoj liber me ane te isbn

        System.out.println(biblioteka.kerkoLiberMeIsbn(biblioteka,"978-69-9430-14-30"));

        //shfaq librat

        biblioteka.shfaqLibrat(biblioteka);

        // marr liber

        Perdoruesi perdoruesi1=new Perdoruesi("sara","ago");

        System.out.println(biblioteka.merrLiber(biblioteka,perdoruesi1,"978-99-9430-14-30"));
        biblioteka.shfaqLibrat(biblioteka);

        Perdoruesi perdoruesi2=new Perdoruesi("anisa","rama");
        System.out.println(biblioteka.merrLiber(biblioteka,perdoruesi2,"978-99-9430-14-30"));//libri nuk ndodhet ne biblioteke

        Perdoruesi perdoruesi3=new Perdoruesi("hena","jonuzi");
        System.out.println(biblioteka.merrLiber(biblioteka,perdoruesi3,"945-42-65765-17-89"));
        System.out.println(biblioteka);

        //kthe liber

        biblioteka.ktheLiber(biblioteka,"945-42-65765-17-89");
        System.out.println(biblioteka);

    }
}
