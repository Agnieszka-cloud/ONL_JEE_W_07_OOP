package pl.coderslab.oop.constructor;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("ALA", "KOWALSKA", 43, 'k');
        System.out.println(person.toString());
    }
}
