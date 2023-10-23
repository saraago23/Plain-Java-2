package objektetSeanca12.ushtrimi1.ushtrimi3;

public class Rreth extends FiguraGjeometrike{
    private double rreze;

    public Rreth(double rreze){
        this.rreze=rreze;
    }

    public double getRreze() {
        return rreze;
    }

    public void setRreze(double rreze) {
        this.rreze = rreze;
    }


    @Override
    public double llogaritSiperfaqen(){
        return Math.PI*this.rreze*this.rreze;
    }
    @Override
    public double llogaritPerimetrin() {
        return 2*Math.PI*this.rreze;
    }

    public String toString(){
        return "Rreth [rreze= " + getRreze() + ", siperfaqja= " + llogaritSiperfaqen() +
                ", perimetri= " + llogaritPerimetrin() +"]";
    }
}

