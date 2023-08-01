package pl.coderslab.oop.constructor;

//Zadanie 1
//Utwórz klasę `Burger`, dodaj w niej atrybuty:
//- size,
//- price.
public class Burger {
    public String size  = "small";
    public double price = 17.99;

    // 1. Utwórz konstruktor, który przyjmie parametry
    // `size` i `price`i ustawi atrybuty .

    // konstruktor z argumentami, który przyjmie  parametry `size` i `price`i ustawi atrybuty.
    public Burger(String size,double price){
        this.size = size;
        this.price = price;
    }

    //2. Utwórz konstruktor bezargumentowy.
    // konstruktor bezargumentowy
    public Burger(){
    }

    // metoda do wyświetlenia?
    public String toString(){
        return this.size + " " + this.price;
    }
}
