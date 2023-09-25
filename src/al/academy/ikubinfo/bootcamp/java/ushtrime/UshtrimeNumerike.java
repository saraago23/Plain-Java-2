package al.academy.ikubinfo.bootcamp.java.ushtrime;

public class UshtrimeNumerike {
    public static void main(String[] args) {
        int numriPlote = 50;
        double numriPresje = 20.9;
        System.out.println("Numri i plote eshte " + numriPlote + " Numri me presje eshte " + numriPresje);
        double shuma = numriPlote + numriPresje;
        double diferenca = numriPlote - numriPresje;
        double produkti = numriPlote * numriPresje;
        System.out.println("Shume e numrave eshte " + shuma + " Diferenca e numrave eshte " + diferenca
                + " Produkti i dy numrave eshte " + produkti);

        numriPresje += 0.1;
        System.out.println("Numri i dyte eshte " + numriPresje);

        numriPlote = (int) numriPresje;
        System.out.println("numri i plote eshte " + numriPlote + " e kemi bere cast ne int(4 byte) " +
                "pasi ka qene double (8 byte) ");

    }
}
