package objektetSeanca11;

public class Rrethi {

   private int rreze;
    public void setRreze(int rreze) {
        this.rreze = rreze;
    }
    public int getRreze() {
        return rreze;
    }
    public double llogaritSiperfaqen() {
        return Math.PI * rreze * rreze;
    }
    public double llogaritPerimetrin() {
        return 2*Math.PI * rreze;
    }


}
