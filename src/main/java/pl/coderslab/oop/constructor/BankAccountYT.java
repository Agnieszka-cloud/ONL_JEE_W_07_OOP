package pl.coderslab.oop.constructor;
// zadanie 1 praca domowa / rozwiazanie z YouTube
// Stwórz klasę BankAccount, która ma spełniać następujące wymogi:
//
//    Mieć prywatne atrybuty:
//
//    number - atrybut ten powinien trzymać numer identyfikacyjny konta (dla uproszczenia możemy założyć że numerem konta może być dowolna liczba całkowita),
//    cash - atrybut określający ilość pieniędzy na koncie. Ma to być liczba zmiennoprzecinkowa. Atrybut cash powinien być zawsze nastawiany na 0 dla nowo tworzonego konta.
//
//    Posiadać konstruktor przyjmujący tylko numer konta.
//    Posiadać gettery do atrybutów number i cash, ale NIE posiadać do nich setterów (nie chcemy żeby raz stworzone konto mogło zmienić swój numer, a do atrybutu cash dodamy specjalne funkcje modyfikujące jego wartość).
//    Posiadać metodę void depositCash(amount) której rolą będzie zwiększenie wartości atrybutu cash o podaną wartość. Pamiętaj o sprawdzeniu czy podana wartość jest:
//
//    Większa od 0
//
//    Posiadać metodę double withdrawCash(amount) której rolą będzie zmniejszenie wartości atrybutu cash o podaną wartość. Metoda ta powinna zwracać ilość wypłaconych pieniędzy. Dla uproszczenia zakładamy że ilość pieniędzy na koncie nie może zejść poniżej 0, np. jeżeli z konta na którym jest 300zł próbujemy wypłacić 500zł to metoda zwróci nam tylko 300zł. Pamiętaj o sprawdzeniu czy podana wartość jest:
//
//    Większa od 0
//
//    Posiadać metodę String printInfo() nie przyjmującą żadnych parametrów. Metoda ta ma zwracać informację o numerze konta i jego stanie.

public class BankAccountYT {
    private double balance;
    /*private double number = 438989898;
    private double cash = 0.0;*/
    //static  private int nextAccountNumber = 1;


    public BankAccountYT() {

        balance = 0.0;

    }

    /*public double getNumber() {
        return this.number;
    }

    public double getCash() {
        return this.cash;
    }*/

    public void depositCash(double amount) {
        if (amount >= 0) {
            balance = balance + amount;
            //if (amount > 0) {
            //   this.cash = this.cash + amount;
        } else {
            System.out.println("Niewłaściwe dane, podaj liczbę dodatnią");
        }
    }
    public void withdrawCash(double amount) {

        if(amount <= balance){
            balance = balance - amount;
        }
        else{balance = balance - amount;
            System.err.println("not enough money on the account.");
            System.out.println("jpijpoijpoi");
        }
        /*if (amount >= 0) {
            this.cash = this.cash - amount;
        } else {

        }*/
    }

    public double getBalance() {
        return balance;
    }
}


