package objektetSeanca12.ushtrimi1.ushtrimi2;

public class Rreth {

    private double rreze;
    private String ngjyre;

    public Rreth(){
        rreze= 1.0;
        ngjyre="blu";
    }

    public Rreth(double rreze, String ngjyre){
        this.rreze=rreze;
        this.ngjyre=ngjyre;
    }

    public double getRreze() {
        return rreze;
    }

    public void setRreze(double rreze) {
        this.rreze = rreze;
    }

    public String getNgjyre() {
        return ngjyre;
    }

    public void setNgjyre(String ngjyre) {
        this.ngjyre = ngjyre;
    }

    public double ktheSiperfaqenRrethit(double rreze){
        return Math.PI*this.rreze*this.rreze;
    }

    @Override
    public String toString(){
        return "Rrethi me rreze: " + getRreze() + ", ngjyre: " + getNgjyre();
    }
}
