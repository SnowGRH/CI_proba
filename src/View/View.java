package View;

import java.util.Scanner;

public class View {

    static Scanner sc = new Scanner(System.in);

    public int beker() {
        int be = sc.nextInt();
        return be;
    }

    public void kiir(String txt) {
        System.out.println(txt);
    }

}
