package oop3.src;

public class Ingredients {
    private int id;
    private String emer;
    private double gramature;
    private boolean isHealthy;

    public Ingredients() {
    }

    public Ingredients(String emer, double gramature, boolean isHealthy) {
        this.emer = emer;
        this.gramature = gramature;
        this.isHealthy = isHealthy;
        id++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmer() {
        return emer;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }

    public double getGramature() {
        return gramature;
    }

    public void setGramature(double gramature) {
        this.gramature = gramature;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }
}


