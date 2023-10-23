package objektetSeanca12.ushtrimi1.ushtrimi2;

public class Test {
    public static void main(String[] args) {

        Cilinder c1= new Cilinder();
        c1.setLartesi(2.5);
        System.out.println(c1);
        System.out.println("Vellimi i cilindrit me rreze: " + c1.getRreze() + " dhe " +
                        "lartesi: " + c1.getLartesi() + " eshte: " + c1.ktheVelliminCilindirt(c1.getRreze(),c1.getLartesi()));
        System.out.println("************************************");

        Cilinder c2 = new Cilinder(4,"jeshile",3.2);
        System.out.println(c2);
        c2.setRreze(5);
        c2.setLartesi(4.6);
        System.out.println("Vellimi i cilindrit me rreze: " + c2.getRreze() + " dhe lartesi: " + c2.getLartesi() +
                " eshte: " + c2.ktheVelliminCilindirt(c2.getRreze(), c2.getLartesi()) );

        System.out.println("************************************");

        Rreth rr1= new Rreth();
        System.out.println(rr1);

        System.out.println("************************************");

        Rreth rr2 = new Rreth(9.1,"roze");
        System.out.println("Siperfaqja e rrethit me rreze: " + rr2.getRreze() + " eshte " +
                rr2.ktheSiperfaqenRrethit(rr2.getRreze()));
    }
}
