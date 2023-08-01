package pl.coderslab.oop.constructor;

public class Person {
    private final String name;
    private String surname;
    private int age;
    private char gender;


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
    public String toString(){

        return this.name + " " + this.surname + " " + this.age + " " + this.gender;
    }
}