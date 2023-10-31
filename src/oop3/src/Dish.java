package oop3.src;

public class Dish {
    private int id;
    private static int counter=1;
    private String emri;
    private double cmimi;



    public Dish(String emri, int cmimi) {
        this.id=counter++;
        this.emri = emri;
        this.cmimi = cmimi;
    }


    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public double getCmimi() {
        return cmimi;
    }

    public void setCmimi(double cmimi) {
        this.cmimi = cmimi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.emri + " " + this.cmimi;
    }
}
