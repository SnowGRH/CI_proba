package logikaioop;

import java.util.Scanner;

public class Ladak {

    private Lada L1, L2, L3;
    static Scanner sc = new Scanner(System.in);

    public Ladak(Lada L1, Lada L2, Lada L3) {
        this.L1 = L1;
        this.L2 = L2;
        this.L3 = L3;
        kiir();
        beker();
    }

    public int beker() {
        System.out.println("Melyik ");
        int be = sc.nextInt();
        return be;
    }

    private void kiir() {
        System.out.println("Leírás");
        System.out.println(L1.toString());
        System.out.println(L2.toString());
        System.out.println(L3.toString());
    }
}
