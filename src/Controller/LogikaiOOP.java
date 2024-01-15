package Controller;

import Model.Ladak;
import Model.Lada;

public class LogikaiOOP {


    public static void main(String[] args) {
        Start();
    }

    private static void Start() {
        View v = new View();
        Lada l1 = new Lada("1.Arany láda","'én rejtem a kincset!'",false);
        Lada l2 = new Lada("2.Ezüst láda","'nem én rejtem a kincset!'",true);
        Lada l3 = new Lada("3.Bronz láda","'az arany hazudik!",false);
        
        Ladak ladak = new Ladak(l1, l2, l3);
        v.kiir(ladak.kiir());
       v.kiir("Melyikben van a kincs?(számot adj meg)");
        int valasz = ladak.beker();
        v.kiir(ladak.Valasz(valasz));
    }

}
