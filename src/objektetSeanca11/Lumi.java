package objektetSeanca11;

public class Lumi {
    private String emriLumit;
    private int gjatesiaLumit;

    Lumi(String emriLumit, int gjatesiaLumit) {
        this.emriLumit = emriLumit;
        this.gjatesiaLumit = gjatesiaLumit;
    }

    public void setGjatesiaLumit(int gjatesiaLumit) {
        this.gjatesiaLumit = gjatesiaLumit;
    }

    public int getGjatesiaLumit() {
        return gjatesiaLumit;
    }

    public String getEmriLumit() {
        return emriLumit;
    }

    public void setEmriLumit(String emriLumit) {
        this.emriLumit = emriLumit;
    }

    public int ktheLuminMeTeGjate(int l1,int l2, int l3, int l4, int l5){
        int[] lumenjte= {l1,l2,l3,l4,l5};
        int max= Integer.MIN_VALUE;
        for(int i=0;i<lumenjte.length;i++){
            if(lumenjte[i]>max){
                max=lumenjte[i];
            }
        }
        return max;
    }


}
