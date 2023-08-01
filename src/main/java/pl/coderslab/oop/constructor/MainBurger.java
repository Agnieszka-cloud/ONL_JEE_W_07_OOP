package pl.coderslab.oop.constructor;

public class MainBurger {
    private String size  = "small";
    private double price = 17.99;

    public static void  main(String[] args){

        Burger burger1 = new Burger("big",34.99);
        System.out.println(burger1.size);
        System.out.println(burger1.price);
        System.out.println();
        Burger burger = new Burger();
        System.out.println(burger.size);
        System.out.println(burger.price);
        System.out.println();
        System.out.println(burger1.toString());

    }
}
