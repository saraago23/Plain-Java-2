package oop3.src.bibilioteka;

public class Lexuesi extends Person {

    private int id;
    private static int counter = 0;

    public Lexuesi() {
        super();
    }

    public Lexuesi(String emer, String mbiemer) {
        super(emer, mbiemer);
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + " - " + getEmer() + " " + getMbiemer();
    }
}
