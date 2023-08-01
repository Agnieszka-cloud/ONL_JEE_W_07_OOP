package pl.coderslab.oop.constructor;

public class MainCalculator {
    public static void  main(String[] args) {
        // obiekt
        Calculator calculator = new Calculator();

        /* Inne sposoby zapisu tego samego co poniżej:
        double addResult = calculator.add(5,8);
        System.out.println(addResult);
        System.out.println(calculator.add(9,7));*/
        calculator.add(5, 8);
        calculator.multiply(5, 8);
        calculator.subtract(8, 5);
        calculator.divide(8, 5);
        calculator.printOperations();

        calculator.clearOperations();

        System.out.println();
        System.out.println("Jestem po czyszczenia");
        System.out.println();
        System.out.println("Nowa historia operacji");
        calculator.add(8, 9);
        calculator.multiply(8, 9);
        calculator.subtract(8, 9);
        calculator.divide(8, 9);
        calculator.printOperations();
    }
}
