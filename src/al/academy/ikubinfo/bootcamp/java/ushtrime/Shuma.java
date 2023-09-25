package al.academy.ikubinfo.bootcamp.java.ushtrime;

public class Shuma {
    static int numri1;
    static int numri2;


    public static void main(String[] args) {
        numri1 = 4;
        numri2 = 5;
        System.out.println("Shuma e numrit të parë me vlerë: " + numri1 + " dhe numrit të dytë me vlerë: " + numri2 + "  është " + (numri1 + numri2));
        boolean eshteNrPlote;

        if ((numri1 % 1) != 0 && (numri2 % 1) != 0) {
             eshteNrPlote = true;
        } else {
             eshteNrPlote = false;
        }
        System.out.println("Rezultati nese te dy numrat jane te plote eshte: " + eshteNrPlote);
    }
}
