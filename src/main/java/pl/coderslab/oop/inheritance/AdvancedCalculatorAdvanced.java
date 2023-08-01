package pl.coderslab.oop.inheritance;

import java.util.Arrays;

public class AdvancedCalculatorAdvanced extends Calculator {
    public static void main(String[]args){

        AdvancedCalculatorAdvanced advancedCalculatorAdvanced = new AdvancedCalculatorAdvanced();
        Calculator calculator = new Calculator();
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();

        System.out.println(advancedCalculatorAdvanced.computeCircleArea(5));
        System.out.println(advancedCalculatorAdvanced.computeCircleArea(7));

        advancedCalculatorAdvanced.add(4,3);


        advancedCalculatorAdvanced.printGlobalOperations();
        System.out.println("------");
        advancedCalculatorAdvanced.printGlobalOperations(1);
        System.out.println("------");
        advancedCalculatorAdvanced.printGlobalOperationString("2");
        System.out.println("------");

        calculator.subtract(5,7);
        advancedCalculator.pow(3,3);
        advancedCalculator.root(27,3);


        calculator.printOption();
        advancedCalculator.printOperations();

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
