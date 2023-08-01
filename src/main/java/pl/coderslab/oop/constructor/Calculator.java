package pl.coderslab.oop.constructor;
// ## Zadanie 2
//
// Stwórz klasę ```Calculator```.
// która będzie miała atrybut w którym będzie trzymać historię
//// ostatnich operacji
// Konstruktor ma nie przyjmować żadnych danych.
// Każdy nowo stworzony obiekt powinien mieć
// tablicę String, w której będzie trzymać historię
// ostatnich operacji

//(stwórz ją w konstruktorze – z początkowym rozmiarem 0).

//Następnie dodaj do klasy następujące metody:
//1. ```add(num1, num2)``` – metoda ma dodać do siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "added ```num1``` to ```num2``` got ```result```".
//2. ```multiply(num1, num2)``` – metoda ma pomnożyć przez siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "multiplied ```num1``` with ```num2``` got ```result```".
//3. ```subtract(num1, num2)``` – metoda ma odjąć od siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "subtracted ```num1``` from ```num2``` got ```result```".
//4. ```divide(num1, num2)``` – metoda ma podzielić przez siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "divided ```num1``` by ```num2``` got ```result```". Pamiętaj, że nie można dzielić przez zero.
//5. ```printOperations()``` – metoda ma wypisać wszystkie zapamiętane operacje.
//6. ```clearOperations()``` – metoda ma wyczyścić wszystkie zapamiętane operacje.
//
//Możesz dopisać metodę pomocniczą, która będzie
// dodawała wpis na liście operacji oraz zwiększała
// rozmiar tablicy przez kopiowanie.
//
//Pamiętaj o używaniu ```this``` w odpowiednich miejscach.
//Stwórz kilka kalkulatorów i przetestuj ich działanie.
import java.util.Arrays;

public class Calculator {
    // to są atrybuty klasy:
    public String [] historyOfOperations;


    // konstruktor bezargumentowy który ustawia parametr przechowujący historię operacji
    public Calculator() {

        this.historyOfOperations = new String[0];
    }
    // METODA POMOCNICZA addHistory
    // dodawanie do historii
    public void addHistory(String singleOperationInHistoryOfO) {
        this.historyOfOperations = Arrays.copyOf(this.historyOfOperations,this.historyOfOperations.length + 1);
        this.historyOfOperations[this.historyOfOperations.length - 1] = singleOperationInHistoryOfO; // String tymczasowy
    }

    public double add(double num1,double num2){
        double result = num1 + num2;
        String singleOperationInHistoryOfO = "added " + num1 + " to " + num2 + " got " + result;
        addHistory(singleOperationInHistoryOfO);
        return result;
    }

    public double multiply(double num1,double num2){
        double result = num1 * num2;
        String singleOperationInHistoryOfO = "multiplied " + num1 + " by " + num2 + " got " + result;
        addHistory(singleOperationInHistoryOfO);
        return result;
        //return num1*num2;
    }
    public double subtract(double num1, double num2){
        double result = num1 - num2;
        String singleOperationInHistoryOfO = "subtracted " + num1 + " from "+ num2 + " got " +result;
        addHistory(singleOperationInHistoryOfO);
        return result;
    }
    public double divide(double num1,double num2) {
        if(num2 == 0) {
            String singleOperationInHistoryOfO = "[ERROR] divide by zero";
            addHistory(singleOperationInHistoryOfO);
            return 0;
            // ifem załatwiamy case kiedy num2 jest równy zeru przy dzieleniu czyli jeśli jest zerem to dodaj komunikat
        }
        double result = num1 / num2;
        String historyInput = "divided " + num1 + " by " + num2 + " got " + result;
        addHistory(historyInput);
        return result;
    }

    public void printOperations() {
        for (String line : this.historyOfOperations) {
            System.out.println(line);
            // pętlą wyświetlisz wszystkie linie
        }
    }
    public void clearOperations(){

        this.historyOfOperations = new String[0];
        // czyszczenie Stringa, string ma znowu 0
    }
}

