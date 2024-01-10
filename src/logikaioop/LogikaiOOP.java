package logikaioop;

public class LogikaiOOP {


    public static void main(String[] args) {
        Start();
    }

    private static void Start() {
        Lada l1 = new Lada("1.Arany láda","'én rejtem a kincset!'",false);
        Lada l2 = new Lada("2.Ezüst láda","'nem én rejtem a kincset!'",true);
        Lada l3 = new Lada("3.Bronz láda","'az arany hazudik!",false);
        
        Ladak ladak = new Ladak(l1, l2, l3);
        System.out.println("Melyikben van a kincs?(számot adj meg)");
        int valasz = ladak.beker();
        System.out.println(ladak.Valasz(valasz));
    }

}
