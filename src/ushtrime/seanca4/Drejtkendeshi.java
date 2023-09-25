package ushtrime.seanca4;

public class Drejtkendeshi {
    int gjatesi;
    int gjeresi;


    public void setGjatesi(int gjatesi) {
        this.gjatesi = gjatesi;
    }

    public void setGjeresi(int gjeresi) {
        this.gjeresi = gjeresi;
    }

    public int getGjatesi() {
        return gjatesi;
    }

    public int getGjeresi() {
        return gjeresi;
    }
    public int llogaritPerimetrin() {
        return 2 * gjatesi + 2 * gjeresi;
    }

    public static void main(String[] args) {

        Drejtkendeshi d1 = new Drejtkendeshi();
        d1.setGjatesi(4);
        d1.setGjeresi(10);
        System.out.println("Perimetri i drejtkendeshit eshte: " + d1.llogaritPerimetrin());
    }



}
