package objektetSeanca12.ushtrimi1.ushtrimi2;

public class Cilinder extends Rreth {

    private double lartesi;


    public Cilinder(){
        super();
        this.lartesi=1.0;
    }

    public Cilinder(double rreze, String ngjyre, double lartesi){
        super(rreze,ngjyre);
        this.lartesi=lartesi;
    }

    public double getLartesi() {
        return lartesi;
    }

    public void setLartesi(double lartesi) {
        this.lartesi = lartesi;
    }

    public String toString(){
        return "cilindri me rreze: " + getRreze() + ", ngjyre: " + getNgjyre() + ", lartesi; " + getLartesi();
    }

    public double ktheVelliminCilindirt(double rreze, double lartesi){
        return Math.PI*getRreze()*getRreze()*this.lartesi;

    }

}
