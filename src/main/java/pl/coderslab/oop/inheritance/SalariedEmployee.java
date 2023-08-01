package pl.coderslab.oop.inheritance;
//## Zadanie 6
//
//Stwórz klasę `SalariedEmployee` reprezentującą
//pracownika, z którym pracodawca ma umowę miesięczną.
//Klasa powinna:
//
//1. dziedziczyć po klasie `Employee`,
//2. mieć dodatkową metodę `calculatePayment()`,
// która będzie zwracała kwotę do wypłacenia
// pracownikowi za miesiąc
// (dla uproszczenia możemy założyć, że w każdym miesiącu
// jest 190 godzin pracujących – użyj `final static`).
public class SalariedEmployee extends Employee {
    private static final int pensum = 190;
    public SalariedEmployee(int id, String firstname, String lastname, double wage) {
        super(id, firstname, lastname, wage);
    }
    public double calculatePayment(){
        return this.wage * pensum;
    }
}
