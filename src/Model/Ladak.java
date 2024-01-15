package Model;

import java.util.Scanner;

public class Ladak {

    private Lada ladak[];
    static Scanner sc = new Scanner(System.in);

    public Ladak(Lada L1, Lada L2, Lada L3) {
        this.ladak = new Lada[]{L1, L2, L3};

    }

    public int beker() {
        int be = sc.nextInt();
        return be;
    }

    public String Valasz(int vlasza) {
        if (this.ladak[vlasza - 1].isKincs() == true) {
            return "A válasz jó!" + " Ebben van";
        }
        return "A válasz nem jó!";
    }

    public String kiir() {
        String txt = "";
        txt += "Leírás";
        txt += this.ladak[0].toString();
        txt += this.ladak[1].toString();
        txt +=this.ladak[2].toString();
        return txt;
    }
}
