package pl.coderslab.oop.constructor;
//## Zadanie 3
//
//Utwórz klasę `Person`, dodaj w niej atrybuty:
//
//- name
//- surname
//- age
//- gender
//
//Wszystkie atrybuty mają być prywatne.
//
//1. Utwórz konstruktor, który przyjmie i ustawi parametry `name`, `surname`.
//2. Utwórz konstruktor, który przyjmie i ustawi parametry `name`, `age`.
//3. Utwórz konstruktor, który przyjmie i ustawi parametry `name`, `surname`, `age`, `gender`.
public class Person {
    private final String name;
    private String surname;
    private int age;
    private char gender;

//1. Utwórz konstruktor, który przyjmie i ustawi
// parametry `name`, `surname`.

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name, String surname, int age, char gender){
        this.name = name;
        this.surname = surname;
        this. age = age;
        this.gender = gender;
    }

    // co to?
    public String toString(){
        return this.name + " " + this.surname + " " + this.age + " " + this.gender;
    }
}