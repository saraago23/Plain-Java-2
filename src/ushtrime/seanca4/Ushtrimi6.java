package ushtrime.seanca4;

public class Ushtrimi6 {


    static boolean numri25MeVogel24 = true;
    static boolean numri8NrCift = true;

    public static void main(String[] args) {


        System.out.println("Numri 25 është më i vogël se numri 24 DHE numri 8 është numër çift: " + (numri25MeVogel24 && numri8NrCift));

        System.out.println("Numri 25 është më i vogël se numri 24 OSE numri 8 është numër çift: " +
                (numri25MeVogel24 || numri8NrCift));

        System.out.println("Numri 25 është më i vogël se numri 24 DHE numri 8 nuk është numër çift: " + (numri25MeVogel24 && !numri8NrCift));

        System.out.println("Numri 25 nuk është më i vogël se numri 24 OSE numri 8 është numër çift:" + (!numri25MeVogel24 || numri8NrCift));

        System.out.println("Numri 25 nuk është më i vogël se numri 24 DHE numri 8 nuk është numër çift: " + (!numri25MeVogel24 && !numri8NrCift));

    }

}