package Model;

public class Lada {

    private String allitas, anyag;
    private boolean kincs;

    public Lada(String anyag,String allitas,boolean kincs) {
        this.anyag = anyag;
        this.allitas = allitas;
        this.kincs = kincs;
    }   
    
    public String getAllitas() {
        return allitas;
    }

    public String getAnyag() {
        return anyag;
    }

    public boolean isKincs() {
        return kincs;
    }

    public void setAllitas(String allitas) {
        this.allitas = allitas;
    }

    public void setAnyag(String anyag) {
        this.anyag = anyag;
    }

    public void setKincs(boolean kincs) {
        this.kincs = kincs;
    }

    @Override
    public String toString() {
        return anyag+":"+allitas;
    }

}
