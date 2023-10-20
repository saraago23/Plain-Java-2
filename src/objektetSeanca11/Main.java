package objektetSeanca11;

public class Main {
    public static void main(String[] args) {

        //Objekt1.1
        Apartament a1 = new Apartament();
        a1.setKati(5);
        System.out.println("Ju duhet te ngjisni kaq shkalle: " + a1.llogaritNrShkalleve());
        a1.setNrDhomaveTeGjumit(2);
        System.out.println("Akomodimi per numrin e personave te vendosur: " + a1.areThereEnoughRooms(3));

        //Objekt1.2
        Apartament a2 = new Apartament();
        a2.setKati(2);
        System.out.println("Ju duhet te ngjisni kaq shkalle: " + a2.llogaritNrShkalleve());
        a2.setNrDhomaveTeGjumit(3);
        System.out.println("Akomodimi per numrin e personave te vendosur: " + a2.areThereEnoughRooms(6));

        //Objekt1.3
        Apartament a3 = new Apartament();
        a3.setKati(6);
        System.out.println("Ju duhet te ngjisni kaq shkalle: " + a3.llogaritNrShkalleve());
        a3.setNrDhomaveTeGjumit(5);
        System.out.println("Akomodimi per numrin e personave te vendosur: " + a3.areThereEnoughRooms(10));

        //Objekt1.4
        Apartament a4 = new Apartament();
        a4.setKati(3);
        System.out.println("Ju duhet te ngjisni kaq shkalle: " + a4.llogaritNrShkalleve());
        a4.setNrDhomaveTeGjumit(1);
        System.out.println("Akomodimi per numrin e personave te vendosur: " + a4.areThereEnoughRooms(2));

        //Objekt1.5
        Apartament a5 = new Apartament();
        a5.setKati(4);
        System.out.println("Ju duhet te ngjisni kaq shkalle: " + a5.llogaritNrShkalleve());
        a5.setNrDhomaveTeGjumit(3);
        System.out.println("Akomodimi per numrin e personave te vendosur: " + a5.areThereEnoughRooms(6));
        System.out.println("***********************************************************");

        //Objekt2.1
        MiniMarket miri = new MiniMarket("cola", "b-52", "bravo");
        miri.kontrrolloMoshenPerPije(miri.getDrink2());
        miri.ktheKusur(miri.getDrink2(), 200);

        //Objekt2.2
        MiniMarket vjollca = new MiniMarket("bravo", "vere", "uje");
        vjollca.kontrrolloMoshenPerPije(vjollca.getDrink1());
        vjollca.ktheKusur(vjollca.getDrink1(), 300);

        //Objekt2.3
        MiniMarket m3 = new MiniMarket("Paulaner", "tjeter", "uje");
        m3.kontrrolloMoshenPerPije(m3.getDrink1());
        m3.ktheKusur(m3.getDrink1(), 2000);

        //Objekt2.4
        MiniMarket m4 = new MiniMarket("Korca", "cola", "uje");
        m4.kontrrolloMoshenPerPije(m4.getDrink3());
        m4.ktheKusur(m4.getDrink3(), 900);

        //Objekt2.5
        MiniMarket m5 = new MiniMarket("bravo", "fanta", "redbull");
        m5.kontrrolloMoshenPerPije(m5.getDrink3());
        m5.ktheKusur(m5.getDrink3(), 400);

        System.out.println("****************************************************");

        //Objekt3.1

        Llambe llamba1 = new Llambe("Fluoreshente", 200);
        System.out.println("Kjo eshte nje llambe: " + llamba1.getLlojiLlambes() +
                " me nje prodhim drite prej: " + llamba1.getLumenPerVat() + " lm/w");

        //Objekt3.2
        Llambe llamba2 = new Llambe("LED", 100);
        System.out.println("Kjo eshte nje llambe: " + llamba2.getLlojiLlambes() +
                " me nje prodhim drite prej: " + llamba2.getLumenPerVat() + " lm/w");

        //Objekt3.3
        Llambe llamba3 = new Llambe("Inkandeshente", 16);
        System.out.println("Kjo eshte nje llambe: " + llamba3.getLlojiLlambes() +
                " me nje prodhim drite prej: " + llamba3.getLumenPerVat() + " lm/w");

        //Objekt3.4
        Llambe llamba4 = new Llambe("Fluoreshente", 50);
        System.out.println("Kjo eshte nje llambe: " + llamba3.getLlojiLlambes() + " e tipit " +
                llamba4.getTipi() + " me nje prodhim drite prej: " + llamba3.getLumenPerVat() + " lm/w");

        //Objekt3.5
        Llambe llamba5 = new Llambe("Fluoreshente", 120);
        llamba5.setTipi("LL");
        System.out.println("Kjo eshte nje llambe: " + llamba5.getLlojiLlambes() + " e tipit " +
                llamba5.getTipi() + " me nje prodhim drite prej: " + llamba5.getLumenPerVat() + " lm/w");

        System.out.println("Llamba fluoreshente me e forte eshte: "
                + llamba1.ktheLlambenFluoreshenteMeTeForte(llamba4.getLumenPerVat(),
                llamba5.getLumenPerVat()));

        System.out.println("****************************************");
        //Obejkti4.1
        Rrethi r1 = new Rrethi();
        r1.setRreze(3);
        System.out.println("Siperfaqja e rrethit eshte: " + r1.llogaritSiperfaqen());
        System.out.println("Perimetri i rrethit eshte: " + r1.llogaritPerimetrin());

        //Obejkti4.2
        Rrethi r2 = new Rrethi();
        r1.setRreze(6);
        System.out.println("Siperfaqja e rrethit eshte: " + r2.llogaritSiperfaqen());
        System.out.println("Perimetri i rrethit eshte: " + r2.llogaritPerimetrin());

        //Obejkti4.3
        Rrethi r3 = new Rrethi();
        r1.setRreze(7);
        System.out.println("Siperfaqja e rrethit eshte: " + r3.llogaritSiperfaqen());
        System.out.println("Perimetri i rrethit eshte: " + r3.llogaritPerimetrin());

        //Obejkti4.4
        Rrethi r4 = new Rrethi();
        r1.setRreze(20);
        System.out.println("Siperfaqja e rrethit eshte: " + r4.llogaritSiperfaqen());
        System.out.println("Perimetri i rrethit eshte: " + r4.llogaritPerimetrin());

        //Obejkti4.5
        Rrethi r5 = new Rrethi();
        r1.setRreze(34);
        System.out.println("Siperfaqja e rrethit eshte: " + r5.llogaritSiperfaqen());
        System.out.println("Perimetri i rrethit eshte: " + r5.llogaritPerimetrin());

        System.out.println("******************************************");

        //Objekti5.1
        Lumi l1= new Lumi("Bistrica",25);

        //Objekti5.2
        Lumi l2= new Lumi("Buna",44);

        //Objekti5.3
        Lumi l3= new Lumi("Cemi",63);

        //Objekti5.4
        Lumi l4= new Lumi("Drini",160);

        //Objekti5.5
        Lumi l5= new Lumi("Drini i Bardhe",175);

        System.out.println("Lumi me i gjate eshte lumi me siperfaqen: "
                + l1.ktheLuminMeTeGjate(l1.getGjatesiaLumit(),l2.getGjatesiaLumit(),
                l3.getGjatesiaLumit(),l4.getGjatesiaLumit(),l5.getGjatesiaLumit()));
    }
}
