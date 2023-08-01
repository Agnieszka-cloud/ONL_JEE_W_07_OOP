package pl.coderslab.oop.methods;
// ## Zadanie 2
//
//Utwórz klasę `Person`, dodaj w niej atrybuty:
//
//- name,
//- surname,
//- age,
//- gender.
//
//Wszystkie atrybuty mają być prywatne i mają mieć
// ustawione wartości domyślne.
//
//Dodaj metody:
//- `setName`,
//- `setSurname`,
//- `setAge`,
//- `setGender`,
//które ustawią atrybuty klasy zgodnie z nazwą,
// na którą wskazują.
//Np. `setName` – ustawia atrybut `name`.
//
//W pliku `Main01.java` umieść w metodzie `main` kod,
// który utworzy obiekt klasy `Person` o nazwie `person`,
// a następnie
//ustawi za pomocą wcześniej utworzonych metod wszystkie
// atrybuty klasy.

public class Person {

    //Wszystkie atrybuty mają być prywatne i mają mieć
    // ustawione wartości domyślne.

    private String name;
    private String surname;
    private int age = 1;
    private char gender;

    public Person(String name, String surname) {
        this.name  = name;
        this.surname = surname;
    }

    //Dodaj metody:
//- `setName`,
//- `setSurname`,
//- `setAge`,
//- `setGender`,
//
//które ustawią atrybuty klasy zgodnie z nazwą,
// na którą wskazują.
//Np. `setName` – ustawia atrybut `name`.

    public void setName(String name){ this.name = name; }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(char gender){
        this.gender = gender;
    }


    // gettery pobierają dane z bazy
    //## Zadanie 3

    // Do klasy `Person` dopisz metodę `getFullName`,
    // która zwróci imię i nazwisko połączone znakiem spacji.


    public String getPersonName() { return name; }

    public String getPersonSurname() {
        return surname;
    }

    public int getAge() { return age; }

    public char getGender() { return gender; }



    public String getFullName(){
        return this.name + " " + this.surname;
    }

    public int age(){
        return this.age;
    }

    public String getAllDataOfThePerson(){
        return this.name + " " + this.surname + " " + this.age + " " + this.gender;
    }


    /*## Zadanie 4
    W klasie `Person` napisz metodę `increaseAge`, która inkrementuje zmienną `age` o 1.*/
    public void increaseAge(){
        //this.age = age;
        this.age++;
    }
}