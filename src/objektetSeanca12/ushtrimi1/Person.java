package objektetSeanca12.ushtrimi1;

public class Person {

    private String emer;
    private String adrese;

    public Person(){

    }

    public Person(String emer, String adrese){
        this.emer=emer;
        this.adrese=adrese;
    }

    public String getEmer() {
        return emer;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }

    public String getAdrese() {
        return adrese;
    }

    public void setAdrese(String adrese) {
        this.adrese = adrese;
    }


    public String toString() {
        return " ushtrimi1.Person [emri: " + emer + ", adrese: " + adrese + "]";
    }
}
