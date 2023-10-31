package oop3.src.Parking;

public class Biciklete implements MjetTransporti{
    private int nrRrotave;

    public Biciklete(int nrRrotave) {
        this.nrRrotave = nrRrotave;
    }

    public int getNrRrotave() {
        return nrRrotave;
    }

    public void setNrRrotave(int nrRrotave) {
        this.nrRrotave = nrRrotave;
    }


    public void nisMjetin() {
        System.out.println("Bicikleta niset me forcen e trupit");

    }


    public void levizMjetin() {
        // TODO Auto-generated method stub
        System.out.println("Bicikleta leviz ");
    }


    public void ndaloMjetin() {
        // TODO Auto-generated method stub
        System.out.println("Bicikleta ndalon me frena");

    }


    public int merrNrRrotash() {
        // TODO Auto-generated method stub
        return 2;
    }

    @Override
    public double getCmimiParkimit() {
        return 100;
    }

}
