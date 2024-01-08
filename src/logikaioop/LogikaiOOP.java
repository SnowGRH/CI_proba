package logikaioop;

import java.util.Scanner;

public class LogikaiOOP {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Start();
    }

    private static void Start() {
        System.out.println("Leírás");
        System.out.println(new Lada().toString());
        System.out.println("Melyik ");
        String be = sc.nextLine();
        System.out.println(new Lada().Valasz(be));
    }

}
