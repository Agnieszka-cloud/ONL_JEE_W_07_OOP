package pl.coderslab.oop.advanced;

import java.text.ParseException;

//## Zadanie 3
//
// Napisz podstawę programu obiektowego, który będzie
// wspomagać skanowanie produktów w sklepie.
//
//  Stwórz klasę `Product`. Klasa ma posiadać poniższe atrybuty:
//  * `id` – liczba całkowita. Powinna być unikalna w całym
//  systemie (w dalszej części zadania zostanie wyjaśnione jak
//  to osiągnąć),
//  * `name` –  typu String, jest to nazwa danego produktu,
//  * `price` – typu double, jest to cena za jeden produkt.
//  Powinna być większa od `0.01`. Sprawdź ten warunek
//  w setterze utworzonym własnoręcznie. Jeśli warunek nie
//  będzie spełniony – zwróć wyjątek.
public class Product {
    // atrybuty
    private long id;
    private String name;
    private double price;

    private static long nextId = 1;

    //konstruktor
    public Product(String name, double price){
        this.id = nextId;
        nextId++;
        this.name = name;
        setPrice(price);
    }
    // SETERRY NADAWANIE DANYCH
    //  * `price` – typu double, jest to cena za jeden produkt.
    //  Powinna być większa od `0.01`. W setterze sprawdź ten warunek,
    //  który utworzysz własnoręcznie. Jeśli warunek nie
    //  będzie spełniony – rzuć wyjątek.
    // metoda typu setter
    public void setPrice(double price) {
        if(price > 0.01){
            this.price = price;
        } else {
            throw new PriceTooLowException("Cena za niska");
        }
    }

    //METODY TYPU GETTERY POBIERANIE DANYCH
    public long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
//#### Generowanie kolejnego id dla produktu:
//
// W dalszej części programu będziemy chcieli
// identyfikować nasze produkty po ich **id**,
// dlatego musimy zagwarantować, że każdy z utworzonych
// produktów będzie miał unikalny numer identyfikacyjny.
// W tym celu powinniśmy zdefiniować
// zmienną klasową ```nextId```.
// Zmienna ta będzie trzymała **id**, które zostanie
// nadane kolejnemu utworzonemu produktowi. Następnie
// w konstruktorze klasy musimy wykonać poniższe czynności:
//  * każdemu tworzonemu produktowi przypisać **id** trzymane
//  w zmiennej `nextId`,
//  * zwiększyć wartość `nextId` o jeden.
//  w konstruktorze
//    this.id = nextId;
//    nextId++;
// Dzięki temu żaden z naszych produktów
// nie będzie miał takiego samego **id**.