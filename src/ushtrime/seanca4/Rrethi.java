package ushtrime.seanca4;

public class Rrethi {

    int rreze;
public void setRreze(int rreze){
    this.rreze=rreze;
}

public int getRreze(){
    return rreze;
}

public double llogaritSiperfaqen(){
    return Math.PI * rreze*rreze;
}
    public static void main(String[] args) {
        Rrethi r1 = new Rrethi();
        r1.setRreze(3);
        System.out.println("Siperfaqja e rrethit eshte: " + r1.llogaritSiperfaqen());


    }
}
