package paisje.elektronike;

public class Laptop {
   static String sistemOperimi;
    int madhesiaRam;
    String tipiProcesorit;
    static boolean eshteGjendje;
    static String emriPajisjes;
    final String ID_E_PAJISJES= "id";

    public static void main(String[] args) {
        getGjendjenDheOS(true, "Windows 64");
        getGjendjenDheOS(false, "Linux");
        setSistemOperimi("Linux");

    }

    public static void getGjendjenDheOS(boolean eshteGjendje, String sistemOperimi) {
        System.out.println("Ne gjendje: " + eshteGjendje + ";Sistem Operimi:" + sistemOperimi);

    }

    public static void setSistemOperimi(String os){
        sistemOperimi= os;
    }
}
