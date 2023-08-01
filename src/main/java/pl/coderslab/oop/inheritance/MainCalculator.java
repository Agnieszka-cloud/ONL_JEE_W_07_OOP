package pl.coderslab.oop.inheritance;

public class MainCalculator {
    public static void main(String[] args){

        Calculator calculator = new Calculator();

        calculator.add(1,2);
        calculator.multiply(1,2);
        calculator.subtract(1,2);
        calculator.divide(1,0);
        calculator.printOption();

    }
}
