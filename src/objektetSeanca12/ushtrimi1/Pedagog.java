package objektetSeanca12.ushtrimi1;

public class Pedagog extends Person {

    private int nrLendesh;
    private int paga;

    public Pedagog(int nrLendesh, int paga){
        this.nrLendesh=nrLendesh;
        this.paga=paga;
    }

    public void setNrLendesh(int nrLendesh) {
        this.nrLendesh = nrLendesh;
    }

    public int getNrLendesh() {
        return nrLendesh;
    }

    public void setPaga(int paga) {
        this.paga = paga;
    }

    public int getPaga() {
        return paga;
    }

    @Override

    public String toString() {
        return super.toString() + "[numer lendesh: " + nrLendesh + ", paga: " + paga + "]";
    }
}
