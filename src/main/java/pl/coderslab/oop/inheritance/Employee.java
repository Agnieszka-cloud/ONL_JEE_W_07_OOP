package pl.coderslab.oop.inheritance;
//## Zadanie 4
//
//Stwórz klasę `Employee`, która posiada:
//
//1. publiczne atrybuty:
// * `id` – atrybut zawierający informację o numerze identyfikacyjnym pracownika,
// * `firstName` – atrybut określający imię pracownika,
// * `lastName` – atrybut określający nazwisko pracownika,
// * `wage` – atrybut określający stawkę godzinową pracownika,
//2. konstruktor przyjmujący: id, imię, nazwisko i stawkę za godzinę,
//3. metodę `raiseWage(percent)`, której rolą będzie zwiększenie wartości atrybutu `wage` o podany procent.
//Pamiętaj o sprawdzeniu czy podana wartość jest większa lub równa 0.
public class Employee {
    // atrybuty klasy
    public int id;
    public String firstname;
    public String lastname;
    public double wage;

    // konstruktor
    public  Employee(int id, String firstname, String lastname, double wage){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.wage = wage;
    }
    // metoda na podniesienie wynagrodzenia o podany procent z ceny  (jakby brutto)
    public double raiseWage(int percent){
        if(percent <= 0){
            System.out.println("Invalid data");
        }
        return this.wage = this.wage * (1 + percent/100.0);
        //this.wage = this.wage + this.wage * percent/100;
    }
}
