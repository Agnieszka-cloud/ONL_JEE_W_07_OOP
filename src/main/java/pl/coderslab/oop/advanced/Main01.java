package pl.coderslab.oop.advanced;

public class Main01 {
    public static void main(String[]args){
        Product mleko = new Product("Mleko", 4.80);
        Product granola = new Product("Granola", 9.90);
        Product jogurt = new Product("Jogurt",3.60);
        Product woda = new Product("Woda", 9.90);

        // obiekt
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addProduct(mleko,2);
        shoppingCart.addProduct(granola,8);
        shoppingCart.addProduct(jogurt,5);
        shoppingCart.addProduct(woda,5);
        System.out.println("--------------------");
        shoppingCart.removeProduct(mleko);
        shoppingCart.updateProduct(jogurt,2);

        System.out.println(shoppingCart.getTotalQuantity());

        shoppingCart.printReceipt();

    }
}
