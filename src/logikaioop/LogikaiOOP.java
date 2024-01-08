package logikaioop;

public class LogikaiOOP {


    public static void main(String[] args) {
        Start();
    }

    private static void Start() {
        Lada l1 = new Lada("Az 1. allitas");
        Lada l2 = new Lada("A 2. allitas");
        Lada l3 = new Lada("A 3. allitas");
        
        Ladak ladak = new Ladak(l1, l2, l3);
        System.out.println(l1.Valasz());
    }

}
