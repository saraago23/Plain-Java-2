package seanca15;

public abstract class Vehicle implements Wheels {
    private Owner owner;
    private  int tax;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

}
