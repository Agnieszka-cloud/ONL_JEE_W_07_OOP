package pl.coderslab.oop.advanced;

import pl.coderslab.oop.inheritance.Calculator;

import java.util.Arrays;

public class AdvancedCalculator extends Calculator {
    public static void main(String[]args){

        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        System.out.println(advancedCalculator.computeCircleArea(5));
        System.out.println(advancedCalculator.computeCircleArea(7));
        advancedCalculator.printGlobalOperations();
        System.out.println("------");
        advancedCalculator.printGlobalOperations(2);
        System.out.println("------");
        advancedCalculator.printGlobalOperationString("2");

    }
    private static final double PI = 3.14;
    public static String[] historyy = new String[0];
    public static String[] globalOperation = new String[0];
    String row;

    public double computeCircleArea(double r){
        double CircleArea = PI * Math.pow(r,2);
        String row = "powierzchnia koła: " + CircleArea;
        AdddHistory(row);
        return CircleArea;
    }

    // ## Zadanie 2
    //
    // Do klasy ```AdvancedCalculator``` dopisz:
    //
    // 1. przeciążoną metodę `printGlobalOperations(int length)`,
    // która wyświetli określoną liczbę ostatnich operacji,
    // 2. przeciążoną metodę `printGlobalOperations(String length)`,
    // która wyświetli określoną liczbę ostatnich operacji.
    // Wykonaj rzutowanie wartości typu `String`.
    // Napisz obsługę odpowiedniego wyjątku.

    public void printGlobalOperations(){
        for (String row:globalOperation
        ) {
            System.out.println(row);
        }
    }

    public void printGlobalOperationString(String length){
        int parsedLength = 0;
        try {
            parsedLength = Integer.parseInt(length);
        } catch (NumberFormatException e){
            System.out.println("Podano złą wartość numeryczną");
        }
        printGlobalOperations(parsedLength);
    }

    public void printGlobalOperations(int length){
        for (int i = 0; i < length; i++) {
            System.out.println(globalOperation[i]);
        }
    }

    protected void AdddHistory(String row) {
        this.historyy = Arrays.copyOf(this.historyy, this.historyy.length + 1);
        this.historyy[this.historyy.length - 1] = row;

        globalOperation = Arrays.copyOf(globalOperation, globalOperation.length + 1);
        globalOperation[globalOperation.length - 1] = row;
    }
}
