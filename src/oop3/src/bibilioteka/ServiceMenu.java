package oop3.src.bibilioteka;

import oop3.src.bibilioteka.customExceptions.*;

import java.time.LocalDateTime;
import java.util.*;

public class ServiceMenu implements Imenu {
    public static Biblioteka biblioteka = new Biblioteka();

    @Override
    public void shtoLexues() {
        System.out.println("Vendosni emrin: ");
        Scanner input = new Scanner(System.in);
        String emer = input.nextLine();
        System.out.println("Vendosni mbiemrin: ");
        String mbiemer = input.nextLine();
        Lexuesi lexuesi = new Lexuesi(emer, mbiemer);
        biblioteka.getLexuesit().add(lexuesi);
        System.out.println("Lexuesi me id " + lexuesi + " u shtua me sukses!");
    }

    //TODO Lexuesi mund te fshihet ne rastin kur i ka kthyer te gjithe librat
    @Override
    public void fshiLexues() {
        System.out.println("Vendosni emrin dhe mbiemrin e perdoruesit qe do te fshini");
        Scanner input = new Scanner(System.in);
        String emer = input.next();
        String mbiemer = input.next();
        Lexuesi perTuFshire = null;
        for (Lexuesi lexuesi : biblioteka.getLexuesit()) {
            if (emer.equalsIgnoreCase(lexuesi.getEmer()) &&
                    mbiemer.equalsIgnoreCase(lexuesi.getMbiemer())) {
                perTuFshire = lexuesi;
            }
        }
        if (perTuFshire != null) {
            biblioteka.getLexuesit().remove(perTuFshire);
            System.out.println("Lexuesi me id : " + perTuFshire + " u fshi me sukses!");
        } else {
            System.out.println("Perdoruesi me emer dhe mbiemer: " + emer + " " + mbiemer + " nuk ekziston!");
        }
    }

    @Override
    public void shtoLiber() throws NotValidException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vendos titullin e librit: ");
        String titulli = scanner.nextLine();
        if (titulli.length() < 2) {
            throw new NotValidException("Titulli duhet te kete minimalisht 2 karaktere!");
        }

        System.out.println("Vendos vitin e prodhimit: ");
        String vitProdhimiStr = scanner.next();
        int vitProdhimi;
        try {
            vitProdhimi = Integer.parseInt(vitProdhimiStr);

        } catch (NumberFormatException e) {
            throw new NotValidException("Viti nuk ka formatin e duhur!");
        }

        if (vitProdhimi > LocalDateTime.now().getYear()) {
            throw new NotValidException("Viti i prodhimit me i madh se viti aktual!");
        }

        System.out.println("Vendos ISBN-ne e librit: ");
        String isbn = scanner.next();
        if (isbn.length() != 13) {
            throw new NotValidException("ISBN duhet te kete 13 karaktere!");
        }
        Libri liberEkzistues = kerkoLiberMeIsbn(isbn);
        if (liberEkzistues != null) {
            throw new NotValidException("Ekziston nje liber me kete ISBN: " + liberEkzistues);
        }

        List<Autor> autoretLibrit = vendosAutoret();

        Libri libri = new Libri(titulli, autoretLibrit, isbn, vitProdhimi);
        biblioteka.getLibrat().add(libri);

        System.out.println("Ne biblioteke u shtua libri: " + libri);
    }

    public List<Autor> vendosAutoret() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sa autore ka libri? ");
        int nrAutore = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                nrAutore = scanner.nextInt();
                break;
            } else {
                System.out.println(scanner.next() + " nuk eshte nje vlere e vlevshme, ju lutem vendosni nje numer!");
            }
        }

        List<Autor> autoretLibrit = new ArrayList<>();
        for (int i = 1; i <= nrAutore; i++) {
            System.out.println("Vendos emrin e autorit me nr " + i + ":");
            String emriAutorit = scanner.next();
            System.out.println("Vendos mbiemri e autorit me nr " + i + ":");
            String mbiemriAutorit = scanner.next();
            Autor autor = new Autor(emriAutorit, mbiemriAutorit);
            autoretLibrit.add(autor);
        }
        return autoretLibrit;
    }

    @Override
    public void fshiLiber() throws BookNotFoundException, NotValidException {
        System.out.println("Vendos ISBN e librit qe deshironi te fshini: ");
        Scanner scanner = new Scanner(System.in);
        String isbn = scanner.next();
        if (isbn.length() != 13) {
            throw new NotValidException("ISBN-ja nuk ka format te sakte!");
        }
        Libri perTuFshire = null;
        for (Libri libri : biblioteka.getLibrat()) {
            if (libri.getIsbn().equals(isbn)) {
                perTuFshire = libri;
            }
        }
        if (perTuFshire != null) {
            if (perTuFshire.isRezervuar()) {
                throw new NotValidException("Libri me ISBN: " + isbn + " nuk mund te fshihet pasi eshte i rezervuar!");
            }
            biblioteka.getLibrat().remove(perTuFshire);
            System.out.println("Libri: " + perTuFshire.getIsbn() + " - " + perTuFshire.getTitulli() + " u fshi me sukses!");
        } else {
            throw new BookNotFoundException("Libri me ISBN: " + isbn + " nuk u gjet!");
        }
    }

    @Override
    public void gjejLiber() throws NotValidException, BookNotFoundException {
        System.out.println("Zgjidhni kategorine me te cilen deshironi te kerkoni nje liber: ");
        System.out.println("A.Titulli");
        System.out.println("B.ISBN");
        System.out.println("C.Autori");
        Scanner scanner = new Scanner(System.in);
        String opsioniZgjedhur = scanner.next();

        switch (opsioniZgjedhur.toLowerCase()) {
            case "a": {
                scanner = new Scanner(System.in);
                System.out.println("Vendosni titullin qe deshironi te kerkoni: ");
                String titulli = scanner.nextLine();
                Libri libri = kerkoLiberMeTitull(titulli);
                if (libri == null) {
                    throw new BookNotFoundException("Libri me titullin: " + titulli + " nuk u gjet!");
                }
                System.out.println("Libri : u gjet" + libri);
                break;
            }
            case "b": {
                System.out.println("Vendosni ISBN qe deshironi te kerkoni: ");
                String isbn = scanner.next();
                if (isbn.length() != 13) {
                    throw new NotValidException("ISBN-ja nuk ka format te sakte!");
                }
                Libri libri = kerkoLiberMeIsbn(isbn);
                if (libri == null) {
                    throw new BookNotFoundException("Libri me ISBN: " + isbn + " nuk u gjet!");
                }
                System.out.println("Libri : u gjet" + libri);
                break;
            }
            case "c": {
                System.out.println("Vendos emrin e autorit: ");
                String emri = scanner.next();
                System.out.println("Vendos mbiemrin e autorit: ");
                String mbiemri = scanner.next();
                List<Libri> librat = kerkoLiberMeAutor(emri, mbiemri);
                if (librat.isEmpty()) {
                    throw new BookNotFoundException("Nuk u gjet asnje liber per autorin : " + emri + " " + mbiemri);
                }
                System.out.println("U gjet/en libri/at: ");
                for (Libri l : librat) {
                    System.out.println(l);
                }
                break;
            }
            default:
                throw new NotValidException("Ju nuk zgjodhet asnje nga kategorite te vlefshme!");
        }
    }

    public Libri kerkoLiberMeTitull(String titulli) {

        for (Libri l : biblioteka.getLibrat()) {
            if (l.getTitulli().equalsIgnoreCase(titulli)) {
                return l;
            }
        }
        return null;
    }

    public List<Libri> kerkoLiberMeAutor(String emer, String mbiemer) {
        List<Libri> librat = new ArrayList<>();
        for (Libri l : biblioteka.getLibrat()) {
            for (Autor a : l.getAutoret()) {
                if (a.getEmer().equalsIgnoreCase(emer) && a.getMbiemer().equalsIgnoreCase(mbiemer)) {
                    librat.add(l);
                }
            }
        }
        return librat;
    }

    public Libri kerkoLiberMeIsbn(String isbn) {
        for (Libri l : biblioteka.getLibrat()) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }

    public void merrLiber() throws BookNotFoundException, ReaderNotFoundException, NotValidException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendosni emrin e lexuesit:");
        String emri = scanner.next();
        System.out.println("Vendosni mbiemrin e lexuesit:");
        String mbiemri = scanner.next();
        Lexuesi lexuesiPerRezervim = null;
        for (Lexuesi lexuesi : biblioteka.getLexuesit()) {
            if (lexuesi.getEmer().equalsIgnoreCase(emri) && lexuesi.getMbiemer().equalsIgnoreCase(mbiemri)) {
                lexuesiPerRezervim = lexuesi;
            }
        }
        if (lexuesiPerRezervim == null) {
            throw new ReaderNotFoundException("Lexuesi me emer: " + emri + " " + mbiemri + " nuk eshte i regjistruar!");
        }

        System.out.println("Vendosni ISBN e librit qe doni te rezervoni");
        String isbn = scanner.next();
        if (isbn.length() != 13) {
            throw new NotValidException("ISBN-ja nuk ka format te sakte!");
        }
        Libri libri = kerkoLiberMeIsbn(isbn);
        if (libri == null) {
            throw new BookNotFoundException("Libri me ISBN: " + isbn + " nuk u gjet!");
        }
        if (libri.isRezervuar()) {
            throw new NotValidException("Libri me ISBN: " + isbn + " per momentin eshte i rezervuar!");
        }

        Rezervim rezervim = new Rezervim();
        rezervim.setLexuesi(lexuesiPerRezervim);
        rezervim.setLibri(libri);
        rezervim.setDataMarrjes(LocalDateTime.now());
        biblioteka.getRezervimet().add(rezervim);

        libri.setRezervuar(true);

        System.out.println("Libri: " + libri.getTitulli() + " - " + libri.getIsbn() + " u rezervua me sukses nga: "
                + lexuesiPerRezervim.getEmer() + " " + lexuesiPerRezervim.getMbiemer() + " ne daten: " + rezervim.getDataMarrjes());

    }


    public void ktheLiber() throws NotValidException, BookNotFoundException, ReaderNotFoundException, ReservationNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendosni emrin e lexuesit:");
        String emri = scanner.next();
        System.out.println("Vendosni mbiemrin e lexuesit:");
        String mbiemri = scanner.next();
        Lexuesi lexuesiPerKthim = null;

        for (Lexuesi lexuesi : biblioteka.getLexuesit()) {
            if (lexuesi.getEmer().equalsIgnoreCase(emri) && lexuesi.getMbiemer().equalsIgnoreCase(mbiemri)) {
                lexuesiPerKthim = lexuesi;
            }
        }
        if (lexuesiPerKthim == null) {
            throw new ReaderNotFoundException("Lexuesi me emer: " + emri + " " + mbiemri + " nuk eshte i regjistruar!");
        }

        System.out.println("Vendosni ISBN e librit qe doni te ktheni");
        String isbn = scanner.next();
        if (isbn.length() != 13) {
            throw new NotValidException("ISBN-ja nuk ka format te sakte!");
        }
        Libri libri = kerkoLiberMeIsbn(isbn);
        if (libri == null) {
            throw new BookNotFoundException("Libri me ISBN: " + isbn + " qe doni te ktheni nuk i perket bibliotekes!");
        }
        if (!libri.isRezervuar()) {
            throw new NotValidException("Libri me ISBN: " + isbn + " nuk ka qene i rezervuar!");
        }
        Rezervim rezervim = null;
        for (Rezervim r : biblioteka.getRezervimet()) {
            if (r.getLexuesi().equals(lexuesiPerKthim) && r.getLibri().equals(libri)) {
                rezervim = r;
                break;
            }
        }
        if (rezervim == null) {
            throw new ReservationNotFoundException("Rezervimi per lexuesin : " + emri + " " + mbiemri + " per librin: " + libri.getTitulli() + "nuk ndodhet ne sistem");
        }

        libri.setRezervuar(false);
        rezervim.setDataKthimit(LocalDateTime.now());
        System.out.println("Libri: " + libri.getTitulli() + " u kthye me sukses nga: " + lexuesiPerKthim.getEmer() + " ne daten: " +
                rezervim.getDataKthimit());

    }

    @Override
    public void kthePersoninQeKaLexuarMeShumeLibra() throws NotValidException {
        if (biblioteka.getRezervimet().isEmpty()) {
            throw new NotValidException("Lexuesit akoma nuk kane marre libra ne kete biblioteke");
        }

        Map<Lexuesi, List<Libri>> libraPerLexues = new HashMap<>();

        Lexuesi lexuesiMax = null;
        for (Rezervim r : biblioteka.getRezervimet()) {
            if (libraPerLexues.containsKey(r.getLexuesi())) {
                libraPerLexues.get(r.getLexuesi()).add(r.getLibri());
            } else {
                List<Libri> librat = new ArrayList<>();
                librat.add(r.getLibri());
                libraPerLexues.put(r.getLexuesi(), librat);
            }
        }
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Lexuesi, List<Libri>> m : libraPerLexues.entrySet()) {
            if (m.getValue().size() > max) {
                max = m.getValue().size();
                lexuesiMax = m.getKey();
            }
        }
        System.out.println("Lexuesi qe ka lexuar me shume libra eshte: " + lexuesiMax);
    }

    @Override
    public void ktheLibrinMeTeLexuar() throws NotValidException {
        if (biblioteka.getRezervimet().isEmpty()) {
            throw new NotValidException("Lexuesit akoma nuk kane marre libra ne kete biblioteke");
        }
        Map<Libri, Integer> libri = new HashMap<>();
        Libri libriMeLexuar = null;
        int counter = 0;
        int max = Integer.MIN_VALUE;
        for (Rezervim r : biblioteka.getRezervimet()) {
            if (libri.containsKey(r.getLibri())) {
                libri.get(r.getLibri());
            } else {
                libri.put(r.getLibri(), counter++);
            }
        }
        for (Map.Entry<Libri, Integer> m : libri.entrySet()) {
            if (m.getValue() > max) {
                max = m.getValue();
                libriMeLexuar = m.getKey();
            }
        }
        System.out.println("Libri me i lexuar eshte: " + libriMeLexuar);

    }

    @Override
    public void ktheMesatarenLibraveTeLexuarPerPerson() throws NotValidException {
        if (biblioteka.getRezervimet().isEmpty()) {
            throw new NotValidException("Lexuesit akoma nuk kane marre libra ne kete biblioteke");
        }
        double mesatarja = 0;
        List<Libri> libratRezervuarTotal = new ArrayList<>();
        List<Lexuesi> lexuesitTotal = new ArrayList<>();
        for (Rezervim r : biblioteka.getRezervimet()) {
            if (!lexuesitTotal.contains(r.getLexuesi())) {
                lexuesitTotal.add(r.getLexuesi());
            }
            libratRezervuarTotal.add(r.getLibri());

        }
        mesatarja = (double) libratRezervuarTotal.size() / lexuesitTotal.size();
        System.out.println("Mesatarja e librave te lexuar per person eshte: " + mesatarja);
    }

    @Override
    public void ktheLibratQeKaLexuarPersoni() throws ReaderNotFoundException, BookNotFoundException {
        System.out.println("Vendosni emrin: ");
        Scanner input = new Scanner(System.in);
        String emer = input.next();
        System.out.println("Vendosni mbiemrin: ");
        String mbiemer = input.next();
        Lexuesi lexuesi = kerkoLexuesMeEmerDheMbiemer(emer, mbiemer);

        if (lexuesi == null) {
            throw new ReaderNotFoundException("Lexuesi: " + emer + " " + mbiemer + " nuk u gjet ne sistemin e bibliotekes");
        }


        List<Libri> libratLexuesit = new ArrayList<>();
        for (Rezervim r : biblioteka.getRezervimet()) {
            if (r.getLexuesi().equals(lexuesi)) {
                libratLexuesit.add(r.getLibri());
            }
        }

        if (libratLexuesit.isEmpty()) {
            throw new BookNotFoundException("Lexuesi nuk ka marre asnje liber nga biblioteka");
        }

        System.out.println("Librat qe ka lexuar lexuesi:" + emer + " " + mbiemer);
        for (int i = 1; i <= libratLexuesit.size(); i++) {
            System.out.println(i + "." + libratLexuesit.get(i-1).getTitulli());
        }
    }

    private Lexuesi kerkoLexuesMeEmerDheMbiemer(String emer, String mbiemer) {
        for (Lexuesi l : biblioteka.getLexuesit()) {
            if (l.getEmer().equalsIgnoreCase(emer) && l.getMbiemer().equalsIgnoreCase(mbiemer)) {
                return l;
            }
        }

        return null;
    }

    @Override
    public List<Libri> ktheLexuesitElibrit(String titulliLibrit) {
        return null;
    }

    @Override
    public Zhaner ktheZhanerinMeTeLexuar(Biblioteka biblioteka) {
        return null;
    }

    @Override
    public List<Libri> ktheLibratPerZhaner(Zhaner zhaner) {
        return null;
    }

    @Override
    public Autor ktheAutorinQeKaShkruarMeShumeLibra(Biblioteka biblioteka) {
        return null;
    }

    @Override
    public Autor ktheAutorinMeTeLexuar(Biblioteka biblioteka) {
        return null;
    }

    @Override
    public void shfaqLibrat(Biblioteka biblioteka)  {

    }

    @Override
    public void shfaqPerdoruesit(Biblioteka biblioteka)  {

    }
}
