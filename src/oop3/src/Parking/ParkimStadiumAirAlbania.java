package oop3.src.Parking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ParkimStadiumAirAlbania implements IParking {

    private static List<MjetiParkuar> mjeteTeParkuara = new ArrayList<>();
    // private static int limitiDitor = 100;
    private static int limitiDitor = 7;

    public static void main(String[] args) {
        Biciklete biciklete = new Biciklete(2);
        Makine makineElektrike = new MakineElektrike("AA 748 VK", 4);
        Makine makine = new Makine("AA 821 UV", 4);
        MjetTransporti motor = new Motor("AA 762 KO", 2);
        ParkimStadiumAirAlbania parking = new ParkimStadiumAirAlbania();
        parking.shtoMjetTransportiNeParkim(biciklete);
        parking.shtoMjetTransportiNeParkim(makineElektrike);
        parking.shtoMjetTransportiNeParkim(makine);
        parking.shtoMjetTransportiNeParkim(motor);

        System.out.println(parking.merrNumerParkimePerMuaj(10));

        parking.paguajParkim(motor);
        parking.paguajParkim(makine);
        parking.printoNrMjeteTransportiPerVit(2023);

    }


    @Override
    public void shtoMjetTransportiNeParkim(MjetTransporti mjetTransporti) {
        if (kaVendeTeLira(LocalDate.now())) {
            MjetiParkuar mjetiParkuar = new MjetiParkuar();
            mjetiParkuar.setMjetTransporti(mjetTransporti);
            mjetiParkuar.setData(LocalDate.now());
            mjeteTeParkuara.add(mjetiParkuar);
        } else {
            System.out.println("Nuk ka vende te lira sot");
        }
    }

    @Override
    public void rezervoParkimPerMjetTransportiDheDate(MjetTransporti mjetTransporti, LocalDate data) {
        if (kaVendeTeLira(data)) {
            MjetiParkuar mjetiParkuar = new MjetiParkuar();
            mjetiParkuar.setMjetTransporti(mjetTransporti);
            mjetiParkuar.setData(data);
            mjeteTeParkuara.add(mjetiParkuar);
        } else {
            System.out.println("Nuk ka vende te lira per: " + data);
        }
    }

    @Override
    public int merrNumerParkimePerMuaj(int muaj) {
        int counter = 0;
        for (MjetiParkuar m : mjeteTeParkuara) {
            if (muaj == m.getData().getMonth().getValue()
                    && LocalDate.now().getYear() == m.getData().getYear()) {
                counter++;
            }
        }
        return counter;
    }


    @Override
    public void paguajParkim(MjetTransporti mjetTransporti) {
        boolean flag = false;
        for (MjetiParkuar m : mjeteTeParkuara) {
            if (mjetTransporti.equals(m.getMjetTransporti())) {
                m.setCmimi(mjetTransporti.getCmimiParkimit());
                m.setPaguar(true);
                System.out.println("Tipi i mjetit te transportit: " + m.getMjetTransporti().getClass().getName() + " pagoi: " + m.getCmimi() + " Lek");
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Mjeti i transportit nuk u gjet ne parkim");
        }
    }

    @Override
    public double llogaritFitimPerVit(int viti) {
        double fitimi = 0;
        for (MjetiParkuar m : mjeteTeParkuara) {
            if (m.getData().getYear() == viti) {
                fitimi += m.getCmimi();
            }
        }
        return fitimi;
    }

    @Override
    public void printoNrMjeteTransportiPerVit(int viti) {
        int totaliMakinave = 0;
        int totaliMakinaveElektrike = 0;
        int totaliMotorave = 0;
        int totaliBicikletave = 0;
        for (MjetiParkuar m : mjeteTeParkuara) {
            if (m.getMjetTransporti().getClass().equals(Makine.class)) {
                totaliMakinave++;
            } else if (m.getMjetTransporti().getClass().equals(MakineElektrike.class)) {
                totaliMakinaveElektrike++;
            } else if (m.getMjetTransporti().getClass().equals(Motor.class)) {
                totaliMotorave++;
            } else if (m.getMjetTransporti().getClass().equals(Biciklete.class)) {
                totaliBicikletave++;
            }
        }
        System.out.println("Makina: " + totaliMakinave + " mjete");
        System.out.println("Makina Elektike: " + totaliMakinaveElektrike + " mjete");
        System.out.println("Motore: " + totaliMotorave + " mjete");
        System.out.println("Bicikleta: " + totaliBicikletave + " mjete");
    }

    public boolean kaVendeTeLira(LocalDate localDate) {
        int counter = 0;
        for (MjetiParkuar m : mjeteTeParkuara) {
            if (localDate.equals(m.getData())) {
                counter++;
            }
        }
        if (counter < limitiDitor) {
            return true;
        }
        return false;
    }


}
