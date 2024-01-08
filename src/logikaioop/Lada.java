package logikaioop;

public class Lada {
        private String allitas,anyag;
        private boolean kincs;

    public Lada(String allitas) {
        this.allitas = allitas;
        anyag="Vas";
        kincs=true;
    }

    public Lada(String allitas, String anyag) {
        this.allitas = allitas;
        this.anyag = anyag;
        kincs=false;
    }
        
    public Lada(String allitas, String anyag, boolean kincs) {
        this.allitas = allitas;
        this.anyag = anyag;
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

    public void setAnayg(String anayg) {
        this.anyag = anayg;
    }

    public void setKincs(boolean kincs) {
        this.kincs = kincs;
    }

    @Override
    public String toString() {
        return  "allitas=" + allitas + ", anyag=" + anyag + ", kincs=" + kincs;
    }
        
   



}
