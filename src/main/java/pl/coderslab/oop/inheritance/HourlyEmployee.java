package pl.coderslab.oop.inheritance;
//## Zadanie 5
//
//Stwórz klasę `HourlyEmployee`,
// reprezentującą pracownika, któremu
// pracodawca płaci za godziny.
//Klasa ma spełniać następujące wymogi:
//
//1. ma dziedziczyć po klasie `Employee`,
//2. posiadać dodatkową metodę
// `calculatePayment(hours)`, która będzie
// zwracała kwotę do wypłacenia pracownikowi
// za liczbę wypracowanych godzin.
public class HourlyEmployee extends Employee {

    public HourlyEmployee(int id, String firstname, String lastname, double wage) {
        super(id, firstname, lastname, wage);
    }
    public double calculatePayment(int hours){
        return this.wage * hours;
    }
}
