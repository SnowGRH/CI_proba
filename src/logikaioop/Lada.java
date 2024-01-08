package logikaioop;

public class Lada {

    private String allitas, anyag;
    private boolean kincs;

    public Lada() {
        this.allitas = "Allitas 1";
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

    public String Valasz(int valasz) {
        return "A válasz jó! \n Válasz:"+valasz;
    }

    @Override
    public String toString() {
        return allitas;
    }

}
