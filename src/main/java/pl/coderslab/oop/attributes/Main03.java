package pl.coderslab.oop.attributes;
//## Zadanie 3
//W pliku `Main03.java`, w metodzie `main`,
// utwórz obiekt klasy `Person` o nazwie `person`,
//a następnie wyświetl kolejno atrybuty
// klasy (name, surname, age, gender).
public class MainPerson {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.surname);
        System.out.println(person.age);
        System.out.println(person.gender);
    }
}
