package objektetSeanca12.ushtrimi1.ushtrimi3;

public class Katror extends Drejtkendesh{

    public Katror(double gjatesia){
        super(gjatesia,gjatesia);

    }
    @Override
    public String toString() {
        return "Katror [gjatesia= " + getGjatesia() + ", gjeresia= " + getGjeresia() +
                ", siperfaqja= " + llogaritSiperfaqen() + ", perimetri= " +
                llogaritPerimetrin() + "]";
    }
}
