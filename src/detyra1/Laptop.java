package detyra1;

public class Laptop {
    String sistemOperimi;
    int madhesiaRam;
    String tipiProcesorit;
    boolean eshteGjendje;
    static String emriPajisjes;

    final String ID_E_PAJISJES= "id";

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.eshteGjendje= true;
        laptop1.sistemOperimi= "Windows 64";
        System.out.println(laptop1.getGjendjenDheOs());

        Laptop laptop2 = new Laptop();
        laptop2.eshteGjendje= false;
        laptop2.sistemOperimi = "Linux";
        System.out.println(laptop2.getGjendjenDheOs());

        Laptop laptop3 = new Laptop();
        laptop3.setSistemOperimi("Ubuntu");
        laptop3.setEshteGjendje(true);
        System.out.println(laptop3.getGjendjenDheOs());

    }

   String getGjendjenDheOs(){
        return "Ne gjendje:" + eshteGjendje + "; Sistem operimi " + sistemOperimi;

    }


    public void setSistemOperimi(String sistemOperimi1) {
        sistemOperimi = sistemOperimi1;
    }


    public void setMadhesiaRam(int madhesiaRam1){
        madhesiaRam=madhesiaRam1;
    }

    public void setTipiProcesorit(String tipiProcesorit1){
        tipiProcesorit=tipiProcesorit1;
    }

    public void setEshteGjendje(boolean eshteGjendje1){
        eshteGjendje=eshteGjendje1;
    }

}
