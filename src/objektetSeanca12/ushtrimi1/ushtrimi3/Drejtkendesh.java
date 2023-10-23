package objektetSeanca12.ushtrimi1.ushtrimi3;

public class Drejtkendesh extends FiguraGjeometrike {
    private double gjatesia;
    private double gjeresia;

    public Drejtkendesh(double gjatesia, double gjeresia) {
        this.gjatesia = gjatesia;
        this.gjeresia = gjeresia;
    }

    public double getGjatesia() {
        return gjatesia;
    }

    public void setGjatesia(double gjatesia) {
        this.gjatesia = gjatesia;
    }

    public double getGjeresia() {
        return gjeresia;
    }

    public void setGjeresia(double gjeresia) {
        this.gjeresia = gjeresia;
    }

    @Override
    public double llogaritSiperfaqen(){
        return this.gjatesia * gjeresia;
    }

    @Override
    public double llogaritPerimetrin(){
        return 2 * this.gjatesia + 2 * this.gjeresia;
    }

    public String toString() {
        return "Drejtkendesh [gjatesia= " + getGjatesia() + ", gjeresia= " + getGjeresia() +
                ", siperfaqja= " + llogaritSiperfaqen() + ", perimetri= " +
                llogaritPerimetrin() + "]";
    }
}
