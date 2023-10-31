package oop3.src.Parking;

public class Makine implements MjetTransporti {

    private String targa;
    private int nrRrotave;

    public Makine(String targa, int nrRrotave) {
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

        System.out.println("Makina niset me telekomande");

    }


    public void levizMjetin() {
        System.out.println("Makina leviz me nafte");

    }


    public void ndaloMjetin() {
        System.out.println("Makina ndalon me frena");

    }


    public int merrNrRrotash() {
        // TODO Auto-generated method stub
        return 4;
    }

    @Override
    public double getCmimiParkimit() {
        return 200;
    }

}
