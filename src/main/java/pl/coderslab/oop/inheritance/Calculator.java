package pl.coderslab.oop.inheritance;
// Zadanie dodatkowe powtórkowe
// Stwórz klasę Calculator.
// Konstruktor ma nie przyjmować żadnych danych.
// Każdy nowo stworzony obiekt powinien mieć pustą tablicę,
// w której będzie trzymać historię wywołanych operacji
// (stwórz ją w konstruktorze). Następnie dodaj do klasy
// następujące metody:
//    AddHistory(String SingleOperation) - metoda ma dodawać
//    tablice z wynikiem każdej z 4 operacji String  SingleOperation

import java.util.Arrays;

//    add($num1, $num2) – metoda ma dodać do siebie dwie zmienne i zwrócić wynik.
//    Dodatkowo w tablicy operacji ma zapamiętać napis: "added num1 to num2 got result".

//    multiply($num1, $num2) – metoda ma pomnożyć przez siebie dwie zmienne i zwrócić wynik.
//    Dodatkowo w tablicy operacji ma zapamiętać napis: "multiplied num1 with num2 got result".

//    subtract($num1, $num2) – metoda ma odjąć od siebie dwie zmienne i zwrócić wynik. Dodatkowo w tablicy operacji ma zapamiętać napis: "subtracted num1 from num2 got result".

//    divide($num1, $num2) – metoda ma podzielić przez siebie dwie zmienne i zwrócić wynik. Dodatkowo w tablicy operacji ma zapamiętać napis: "divided num1 by num2 got result". Pamiętaj, że nie można dzielić przez zero.

//    printOperations() – metoda ma wypisać wszystkie zapamiętane operacje.

//    clearOperations() – metoda ma wyczyścić wszystkie zapamiętane operacje.
//
//Pamiętaj o używaniu this. Stwórz kilka kalkulatorów i przetestuj ich działanie.
public class Calculator {

    private String[] history;
    protected static String[] globalOperation = new String[0];

    protected void AddHistory(String SingleOperation) {
        this.history = Arrays.copyOf(this.history, this.history.length + 1);
        this.history[this.history.length - 1] = SingleOperation;

        globalOperation = Arrays.copyOf(globalOperation, globalOperation.length + 1);
        globalOperation[globalOperation.length - 1] = SingleOperation;
    }
    public Calculator() {

        this.history = new String[0];
    }
    public double add(double num1, double num2) {
        double result = num1 * num2;
        String SingleOperation = "wynik dodawania: " + num1 + " + " + num2 + " = " + result;
        AddHistory(SingleOperation);
        return result;
    }
    public double multiply(double num1, double num2){
        double result = num1 * num2;
        String SingleOperation = "wynik mnożenia: " + num1 + " * " + num2 + " = " + result;
        AddHistory(SingleOperation);
        return result;
    }
    public double subtract(double num1, double num2){
        double result = num1 - num2;
        String SingleOperation = "wynik odejmowania: " + num1 + " - " + num2 + " = " + result;
        AddHistory(SingleOperation);
        return result;
    }
    public double divide( double num1, double num2){
        if(num2 == 0){
            String SingleOperation = "[Error] Nie dzielimy przez zero";
            AddHistory(SingleOperation);
            return 0;
        }
        double result = num1 / num2;
        String SingleOperation = "wynik dzielenia: " + num1 + " / " + num2 + " = " + result;
        AddHistory(SingleOperation);
        return result;
    }
    public void printOption (){
        for (String singleoperations : this.history
        ) {
            System.out.println(singleoperations);
        }
    }
    public void clearOperations(){

        this.history = new String[0];
    }
}
