package Model;

public class Ladak {

    private Lada ladak[];

    public Ladak(Lada L1, Lada L2, Lada L3) {
        this.ladak = new Lada[]{L1, L2, L3};

    }

    public String Valasz(int vlasza) {
        if (this.ladak[vlasza - 1].isKincs() == true) {
            return "A válasz jó!" + " Ebben van";
        }
        return "A válasz nem jó!";
    }

    public String kiir() {
        String txt = "";
        txt += "Leírás\n";
        txt += this.ladak[0].toString() + "\n";
        txt += this.ladak[1].toString() + "\n";
        txt += this.ladak[2].toString() + "\n";
        return txt;
    }
}
