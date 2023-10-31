package oop3.src.Parking;

public class Motor implements MjetTransporti {
    private String targa;
    private int nrRrotave;

    public Motor(String targa, int nrRrotave) {
        this.targa = targa;
        this.nrRrotave = nrRrotave;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getNrRrotave() {
        return nrRrotave;
    }

    public void setNrRrotave(int nrRrotave) {
        this.nrRrotave = nrRrotave;
    }


    public void nisMjetin() {
        System.out.println("Motori niset me celes");

    }


    public void levizMjetin() {
        System.out.println("Motori niset me nafte");

    }


    public void ndaloMjetin() {
        System.out.println("Motori niset me frena");

    }


    public int merrNrRrotash() {
        // TODO Auto-generated method stub
        return 2;
    }

    @Override
    public double getCmimiParkimit() {
        return 150;
    }
}
