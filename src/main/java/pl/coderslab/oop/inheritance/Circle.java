package pl.coderslab.oop.inheritance;
//## Zadanie 3
//
//Stwórz klasę `Circle`, która spełnia następujące wymogi:
//
//1. dziedziczy po klasie definiującej kształt (`Shape`),
//2. ma dodatkowy atrybut `radius`czyli promień,
//3. posiada konstruktor, przyjmujący zmienne określające wartości `x`, `y`, `color` i `radius`,
//4. nadpisuje metodę kształtu – `getDescription()`,
//5. ma metodę o nazwie `getArea()`, zwracającą pole
//   powierzchni typu `double`,
//6. posiada metodę o nazwie `getCircuit()`, zwracającą
//   obwód typu `double`.
//
//Przetestuj metodę `getDistance(Shape shape)` na obiektach typu `Circle`.
public class Circle extends Shape{

    private double radius; //promień koła

    public Circle(double x, double y, String color, double radius){
        super(x,y,color);
        this.radius = radius;
    }
    // opis wartości promienia
    public String getDescription(){
        return "Promień koła wynosi: " + radius;
    }
    // powierzchnia koła P=pi*r2
    public double getArea(){
        double pi = 3.14;
        double result = pi * Math.pow(radius,2);
        // result = Math.PI * Math.pow(radius,2);
        return result;
    }
    // obwód koła O = 2 • π • r
    public double getCircuit(){
        return 2 * Math.PI * radius;
    }
}
//Stwórz klasę Circle, która ma spełniać następujące wymogi:
//
//    Dziedziczyć po kształcie.
//    Mieć dodatkowy atrybut promień.
//    Mieć konstruktor przyjmujący zmienne określające wartości x, y, kolor i promień.
//    Konstruktor powinien wypisywać informacje o właśnie stworzonym okręgu.
//    Pamiętaj o sprawdzeniu:
//
//    czy podane zmienne są liczbami (jeżeli nie są, to nastaw oba na 0),
//    czy podany kolor jest napisem.
//
//    Mieć destruktor, który wypisuje informacje o niszczonym okręgu.
//    Mieć funkcję dostępu (get, set) do promienia.
//    Nadpisywać funkcje kształtu (nadpisz tylko te, które tego wymagają).
//    Mieć funkcję zwracającą pole powierzchni.
//    Mieć funkcję zwracającą obwód.