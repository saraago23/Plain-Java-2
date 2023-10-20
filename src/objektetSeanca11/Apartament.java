package objektetSeanca11;

public class Apartament {
    private int kati;
    private int nrDhomaveTeGjumit;

    public int llogaritNrShkalleve(){
        int nrShkalleve=0;
        for(int i=0; i<this.kati;i++){
            nrShkalleve=10*this.kati;
        }
        return nrShkalleve;
    }

    public boolean areThereEnoughRooms(int nrOfGuests){
        if(nrOfGuests<=this.nrDhomaveTeGjumit*2){
            return true;
        }
        return false;
    }

    //konstruktor no args
    Apartament(){

    }
public int getKati(){
        return this.kati;
}
public void setKati(int kati){
        this.kati=kati;
}
public int getNrDhomaveTeGjumit(){
        return this.nrDhomaveTeGjumit;
}
public void setNrDhomaveTeGjumit(int nrDhomaveTeGjumit){
        this.nrDhomaveTeGjumit=nrDhomaveTeGjumit;
}

}
