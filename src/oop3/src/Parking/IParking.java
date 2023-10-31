package oop3.src.Parking;

import java.time.LocalDate;

public interface IParking {

    void shtoMjetTransportiNeParkim(MjetTransporti mjetTransporti);
    void rezervoParkimPerMjetTransportiDheDate(MjetTransporti mjetTransporti, LocalDate data);
    int merrNumerParkimePerMuaj(int muaj);
    void paguajParkim(MjetTransporti mjetTransporti);
    double llogaritFitimPerVit(int viti);
    void printoNrMjeteTransportiPerVit(int viti);

}
