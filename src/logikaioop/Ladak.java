package logikaioop;

import java.util.Scanner;

public class Ladak {

    private Lada ladak [];
    static Scanner sc = new Scanner(System.in);

    public Ladak(Lada L1, Lada L2, Lada L3) {
        this.ladak = new Lada[]{L1,L2,L3};
        kiir();

    }

    public int beker() {
        int be = sc.nextInt();
        return be;
    }
    public String Valasz(int vlasza) {
        if(this.ladak[vlasza-1].isKincs() == true){
        return "A válasz jó!"+" Ebben van";
        }
        return "A válasz nem jó!";
    }
    private void kiir() {
        System.out.println("Leírás");
        System.out.println(this.ladak[0].toString());
        System.out.println(this.ladak[1].toString());
        System.out.println(this.ladak[2].toString());
    }
}
