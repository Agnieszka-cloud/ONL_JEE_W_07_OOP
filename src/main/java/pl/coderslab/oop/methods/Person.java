package pl.coderslab.oop.methods;

public class Person {
    private String name;
    private String surname;
    private int age;
    private char gender;

    public Person(String name, String surname) {
        this.name  = name;
        this.surname = surname;
    }


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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {

        return age;
    }

    public char getGender() {

        return gender;
    }

    public String getFullName(){
        return this.name + " " + this.surname;
    }

    public int age(){
        return this.age;
    }

    public void increaseAge(){
        System.out.println(this.age++); // ++ nie działa
    }
}