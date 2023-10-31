package oop3.src.Parking;

public class MakineElektrike extends Makine{

    public MakineElektrike(String targa, int nrRrotash) {
        super(targa, nrRrotash);
    }

    @Override
    public void levizMjetin() {
        System.out.println("Makina leviz me energji elektrike");

    }

    public void karikoMakineElektrike() {
        System.out.println("Makina karikohet");
    }
}
