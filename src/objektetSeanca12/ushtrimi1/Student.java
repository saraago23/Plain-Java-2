package objektetSeanca12.ushtrimi1;

public class Student extends Person {

    private int nrLendesh;
    private double mesatarja;

    public Student(int nrLendesh, double mesatarja){
        this.nrLendesh=nrLendesh;
        this.mesatarja=mesatarja;
    }

    public int getNrLendesh() {
        return nrLendesh;
    }

    public void setNrLendesh(int nrLendesh) {
        this.nrLendesh = nrLendesh;
    }

    public double getMesatarja() {
        return mesatarja;
    }

    public void setMesatarja(double mesatarja) {
        this.mesatarja = mesatarja;
    }

    @Override
    public String toString() {
        return super.toString() + "[numer lendesh: " + nrLendesh + ", mesatarja: " + mesatarja + "]";
    }
}
