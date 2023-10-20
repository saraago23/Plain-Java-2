package objektetSeanca11;

import java.util.HashMap;
import java.util.Map;

public class MiniMarket {
    private String drink1;
    private String drink2;
    private String drink3;


    MiniMarket(String drink1, String drink2, String drink3) {
        this.drink1 = drink1;
        this.drink2 = drink2;
        this.drink3 = drink3;
    }

    public void kontrrolloMoshenPerPije(String drink) {
        if (drink.equals("b-52") || drink.equals("redbull")
                || drink.equals("Paulaner") || drink.equals("Korca")
                || drink.equals("vere")) {
            System.out.println("Ju duhet te jeni mbi 18 vjec per ta konsumuar kete pije");
        } else {
            System.out.println("Kjo pije mund te konsumohet nga te gjitha moshat");
        }
    }

    public void ktheKusur(String drink, int pagesa) {

        Map<String, Integer> produktet = new HashMap<>();
        produktet.put("cola", 150);
        produktet.put("b-52", 200);
        produktet.put("fanta", 150);
        produktet.put("uje", 100);
        produktet.put("Paulaner", 300);
        produktet.put("Korca", 150);
        produktet.put("bravo", 150);
        produktet.put("tjeter", 120);
        produktet.put("vere", 300);
        produktet.put("redbull", 500);

        int cmimi = 0;
        for (Map.Entry<String, Integer> e : produktet.entrySet()) {
            if (e.getKey().equals(drink)) {
                System.out.println(drink + " kushton " + e.getValue() + " lek");
                cmimi = e.getValue();

                if (pagesa < cmimi) {
                    System.out.println("Ju nuk keni mjaftueshem lek");
                }
                break;

            }
        }
        System.out.println("Kusuri juaj eshte: " + (pagesa - cmimi));

    }

    public String getDrink1(){
        return this.drink1;
    }

    public String getDrink2(){
        return this.drink2;
    }

    public String getDrink3(){
        return this.drink3;
    }

    public void setDrink1(String drink1){
        this.drink1=drink1;
    }
    public void setDrink2(String drink2){
        this.drink2=drink2;
    }
    public void setDrink3(String drink3){
        this.drink3=drink3;
    }

}

