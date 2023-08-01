package pl.coderslab.oop.inheritance;
//## Zadanie 1
//Stwórz klasę ```AdvancedCalculator```,
// która dziedziczy po klasie ```Calculator```.
//Klasa powinna implementować następujące metody:

//1. pow(num1, num2); metoda ma
// zwracać ```num1``` do potęgi ```num2```.
//Dodatkowo w tablicy operacji ma
// zapamiętać napis: "```num1```^```num2``` equals ```result```".

//2. root(num1, num2); metoda ma
// wyliczyć pierwiastek num2 stopnia z num1.
//Dodatkowo w tablicy operacji ma
// zapamiętać napis: "```num2``` root of ```num1``` equals ```result```".

import pl.coderslab.oop.constructor.Calculator;

public class AdvancedCalculator extends Calculator {
    //konstruktor
    public AdvancedCalculator() {

        this.historyOfOperations = new String[0];
    }
// 1. pow(num1, num2);
// metoda ma
// zwracać ```num1``` do potęgi ```num2```.
// Dodatkowo w tablicy operacji ma
// zapamiętać napis: "```num1```^```num2``` equals ```result```".

    public double pow(double num1, double num2) {
        double result = Math.pow( num1, num2);
        String singleOperationInHistoryOfO = "Potęgowanie: " + num1 + " ^ " + num2 +" equals " + result;
        addHistory(singleOperationInHistoryOfO);
        return result;
    }

    /*public int potęgowanie(int num1, int num2) {
            int result = 1;
            for (int i = 0; i < num2; i++) {
                result = num1 * result;
            }
            return result;
        }*/

// 2.root(num1, num2); metoda ma
// wyliczyć pierwiastek num2 stopnia z num1.
// Dodatkowo w tablicy operacji ma
// zapamiętać napis: "```num2``` root of ```num1``` equals ```result```".

    // pierwiastek z liczby
    //                        27            3
    public double root(double num1, double num2){
        double result = Math.pow(num1,1 / num2);
        String singleOperationInHistoryOfO = "Pierwiastek z liczby: " + num2 + " root of " + num1 + " equals " + result;
        addHistory(singleOperationInHistoryOfO);
        return result;
    }

    // ## Zadanie oop.advanced 1
// Ma być wykonana w katalogu inheritance/dziedziczenie
// Do klasy ```AdvancedCalculator``` dopisz:
//
// 1. stałą ```PI```, która będzie miała przypisaną
// wartość **3.14159265**,
// 2. statyczną metodę ```computeCircleArea(r)``` ,
// która będzie zwracała pole koła. Ta metoda nie
// będzie dopisywać obliczeń do tablicy (napisz w
// komentarzu, dlaczego nie może tego robić),
// 3. statyczną tablicę, która będzie przechowywała
// historię operacji wykonanych na wszystkich kalkulatorach,
// 4. statyczną metodę `printGlobalOperations()`,
// która będzie wyświetlała wszystkie operacje ze
// wszystkich obiektów klasy `Calculator`.
}
