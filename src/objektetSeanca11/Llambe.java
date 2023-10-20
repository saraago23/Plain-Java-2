package objektetSeanca11;

public class Llambe {
    private String llojiLlambes;
    private int lumenPerVat;
   private String tipi;

    Llambe(String tipi) {
        this.tipi=tipi;

    }

    Llambe(String llojiLlambes,int lumenPerVat) {
        this("CFL");
        this.llojiLlambes=llojiLlambes;
        this.lumenPerVat=lumenPerVat;

    }

    public String getLlojiLlambes(){
        return this.llojiLlambes;
    }
    public void setLlojiLlambes(String llojiLlambes){
        this.llojiLlambes=llojiLlambes;
    }

    public int getLumenPerVat(){
        return this.lumenPerVat;
    }
    public void setLumenPerVat(int lumenPerVat){
        this.lumenPerVat=lumenPerVat;
    }

    public String getTipi(){
        return this.tipi;
    }
    public void setTipi(String tipi){
        this.tipi=tipi;
    }

    public int ktheLlambenFluoreshenteMeTeForte(int lumenPerVat1, int lumenPerVat2){
        int max=0;
        if(lumenPerVat1<lumenPerVat2){
            max=lumenPerVat2;
        }else{
            max=lumenPerVat1;
        }
        return max;
    }
}
