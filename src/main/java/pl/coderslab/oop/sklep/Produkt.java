package pl.coderslab.oop.sklep;

public class Produkt {
    private long nr;
    private String nazwa;
    static double cena;

    private static long nextNr = 1;

    public static void setCena(double cena) {
        if(cena > 0.01){
            
        }
        Produkt.cena = cena;
    }
}

