package logikaioop;

public class Osztaly {

    String a1 = "Az 1. állítás";
    String a2 = "A 2. állítás";
    String a3 = "A 3. állítás";


    public String getA1() {
        return a1;
    }

    public String getA2() {
        return a2;
    }

    public String getA3() {
        return a3;
    }

    @Override
    public String toString() {
        return a1 + "\n" + a2 + "\n" + a3;
    }

}
