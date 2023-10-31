package oop3.src.ushtrimi3;

public class Employee implements Ininja{
    private String emer;
    private String mbiemer;
    private String profesioni;
    private int mosha;
    public Employee(){

    }

    public Employee(String emer, String mbiemer,String profesioni, int mosha) {
        this.emer = emer;
        this.mbiemer = mbiemer;
        this.profesioni=profesioni;
        this.mosha = mosha;
    }

    public void punon(){
        System.out.println("Ben pune");
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

    public String getProfesioni() {
        return profesioni;
    }

    public void setProfesioni(String profesioni) {
        this.profesioni = profesioni;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emer='" + emer + '\'' +
                ", mbiemer='" + mbiemer + '\'' +
                ", profesioni='" + profesioni + '\'' +
                ", mosha=" + mosha +
                '}';
    }
}
