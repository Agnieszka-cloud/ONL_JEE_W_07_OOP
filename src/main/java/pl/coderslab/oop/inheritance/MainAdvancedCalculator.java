package pl.coderslab.oop.inheritance;

public class MainAdvancedCalculator {
    public static void main(String[]args){

        //obiekt
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();

        System.out.println(advancedCalculator.pow(3,3));
        System.out.println(advancedCalculator.root(81,4));

        advancedCalculator.add(5,6);
        advancedCalculator.subtract(3,9);
        advancedCalculator.pow(6,10);
        advancedCalculator.divide(12,4);
        advancedCalculator.root(27,3);
        advancedCalculator.printOperations();

        System.out.println("czyszczenie");
        advancedCalculator.clearOperations();

        advancedCalculator.root(27,3);
        advancedCalculator.printOperations();


    }
}
