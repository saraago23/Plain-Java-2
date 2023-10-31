package oop3.src;

public class Customer {

    private int nid;
    private static int counter=1;
    private String adresa;
    private String emer;
    private String mbiemer;

    public Customer(String adresa, String emer, String mbiemer) {

        this.nid = counter++;
        this.adresa = adresa;
        this.emer = emer;
        this.mbiemer = mbiemer;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }


    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getEmer() {
        return emer;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }

    public String getMbiemer() {
        return mbiemer;
    }

    public void setMbiemer(String mbiemer) {
        this.mbiemer = mbiemer;
    }

    @Override
    public String toString() {
        return this.emer + " " + this.mbiemer;
    }
}
