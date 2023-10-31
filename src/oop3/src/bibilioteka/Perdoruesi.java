package oop3.src.bibilioteka;

public class Perdoruesi {

    private int id;
    private static int counter=0;
    private String emer;
    private String mbiemer;

    public Perdoruesi(String emer, String mbiemer){
        this.id=counter++;
        this.emer=emer;
        this.mbiemer=mbiemer;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Perdoruesi{" +
                "id=" + id +
                ", emer='" + emer + '\'' +
                ", mbiemer='" + mbiemer + '\'' +
                '}';
    }
}
