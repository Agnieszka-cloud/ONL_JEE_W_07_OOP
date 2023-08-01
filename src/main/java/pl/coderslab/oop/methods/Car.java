package pl.coderslab.oop.methods;
// ## Zadanie 5
//
//Stwórz klasę `Car`, posiadającą
// następujące atrybuty:
//
//- brand
//- model
//- price
//
//Stwórz metody dostępowe do ww.
// atrybutów, tzw. gettery i settery.
//
//Dopisz metodę `toString`, wyświetlającą
// markę oraz cenę w jednej linii.
public class Car {
    private String brand;
    private String model;
    private double price;

//Stwórz metody dostępowe do ww.
// atrybutów, tzw. gettery
    public String getBrand(){ return brand;}
    public String getModel(){ return model; }
    public double getPrice(){ return price; }

//Stwórz metody dostępowe do ww.
// atrybutów, tzw. settery
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model){

        this.model = model;
    }
    public void setPrice(double price){

        this.price = price;
    }

//Dopisz metodę `toString`, wyświetlającą
// markę oraz cenę w jednej linii.
    public String toString (){
        return "Marka: " + this.brand + "Model: " + this.model + "Cena: " + this.price;}
}
