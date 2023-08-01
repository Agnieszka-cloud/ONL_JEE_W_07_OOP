package pl.coderslab.oop.constructor;

public class MainBurger {
    public static void  main(String[] args){
        Calculator cal = new Calculator();

        double addResult = cal.add(5,8);
        System.out.println(addResult);
        cal.add(5,8);
        cal.multiply(8,0);
        cal.subtract(8,5);
        cal.divide(8,0);

        cal.printOperations();
        System.out.println("Jestem po czyszczenia");

        cal.add(8, 9);
        //cal.printOperatiobn();

    }
}
