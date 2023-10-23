package objektetSeanca12.ushtrimi1.ushtrimi3;

public class Trekendesh extends FiguraGjeometrike {
    private double baze;
    private double lartesi;
    private double brinja1;
    private double brinja2;
    private double tipi;

    public Trekendesh(double baze, double lartesi, double brinja1, double brinja2, double tipi) {
        this.baze = baze;
        this.lartesi = lartesi;
        this.brinja1 = brinja1;
        this.brinja2 = brinja2;
        this.tipi = tipi;
    }

    public double getBaze() {
        return baze;
    }

    public void setBaze(double baze) {
        this.baze = baze;
    }

    public double getLartesi() {
        return lartesi;
    }

    public void setLartesi(double lartesi) {
        this.lartesi = lartesi;
    }

    public double getBrinja1() {
        return brinja1;
    }

    public void setBrinja1(double brinja1) {
        this.brinja1 = brinja1;
    }

    public double getBrinja2() {
        return brinja2;
    }

    public void setBrinja2(double brinja2) {
        this.brinja2 = brinja2;
    }

    public double getTipi() {
        return tipi;
    }

    public void setTipi(double tipi) {
        this.tipi = tipi;
    }

    @Override
    public double llogaritSiperfaqen(){
        return (this.baze * this.lartesi) / 2;
    }

    @Override
    public double llogaritPerimetrin() {
        return this.baze + this.brinja1 + this.brinja2;
    }

    public String getLlojin(double tipi) {
        if (this.tipi == 0) {
            return "Dybrinjenjeshem";
        } else if (this.tipi == 1) {
            return "Kenddrejte";
        } else if (this.tipi == 2) {
            return "Kenddrejte dhe Dybrinjenjeshem";
        } else
            return "I Crregullt";
    }

    public String toString() {
        return "Trekendesh [baze= " + getBaze() + ", lartesi= " + getLartesi() + ", brinja 1= "
                + getBrinja1() + ", brinja 2= " + getBrinja2() + ", tipi- " + getLlojin(getTipi())
                + ", siperfaqja= " + llogaritSiperfaqen() + ", perimetri= " + llogaritPerimetrin() + "]";
    }
}
