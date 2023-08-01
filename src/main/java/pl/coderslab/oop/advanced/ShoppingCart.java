package pl.coderslab.oop.advanced;
// Zadanie nr 4 cd
// 2. Utwórz klasę `ShoppingCart`. Klasa ta ma posiadać
// następujące atrybuty:
//  * `cartItems` – tablica z obiektami klasy `CartItem`.
//
// Do tej zmiennej nie powinno być ustawionych ani getterów,
// ani setterów.

// Klasa ShoppingCart powinna mieć też następujące metody:
//
//  * `addProduct(Product product, int quantity)` – metoda ta powinna
//  dodawać nowy obiekt `CartItem` do tablicy `cartItems`. Przy
//  dodawaniu drugiego egzemplarza produktu pamiętaj o zwiększaniu jego ilości.

//  * `removeProduct(Product product)` – metoda ta powinna usuwać wszystkie sztuki produktu z koszyka.
//  * `updateProduct(Product product, int quantity)` – metoda ta powinna zmieniać ilość danego produktu w koszyku.
//  * `getTotalQuantity()` – metoda ta ma zwracać łączną ilość wszystkich produktów w koszyku.
//  * `getTotalSum()` – metoda ta ma zwracać łączną wartość wszystkich produktów w koszyku.
//  * `printReceipt()` – metoda drukująca paragon.
//  Na paragonie powinno się znaleźć: lista wszystkich
//  produktów, wraz z ich id, nazwą, ceną, ilością i łączną ceną,
//  łączna kwota za wszystkie produkty znajdujące się w koszyku.
//  Zwracaj ciąg znaków w postaci:
//
//```
//1: Produkt 1, 2x2.5 = 5.0
//2: Produkt 2, 3x12.0 = 36.0
//3: Produkt 3, 1x1 = 1
//---
//Razem: 42.0


import java.util.Arrays;

public class ShoppingCart {

    // konstruktor z parametrami produkt i ich ilość
    /*public Product(String name, double price){
        this.id = nextId;
        nextId++;
        this.name = name;
        setPrice(price);
    }*/
    // obiekt klasy Product
    Product milk = new Product("Milk", 4.80);
    // obiekt klasy CartItem
    CartItem cartItem = new CartItem(milk,3);

    // atrybuty klasy ShoppingCart
    // * `cartItems` – tablica z obiektami klasy `CartItem`
    private CartItem[] cartItems;

    //  konstruktor
    public ShoppingCart(){

        this.cartItems = new CartItem[0];
    }

    // * `addProduct(Product product, int quantity)`
    // – metoda ta powinna dodawać nowy obiekt `CartItem`
    // do tablicy `cartItems`. Przy dodawaniu drugiego
    // egzemplarza produktu pamiętaj o zwiększaniu jego ilości.


    //  konstruktor CartItem z parametrem  Product produkt "findCartItemByProduct"
    //  posiadający w ciele metodę hasProduct znajdująca produkt po id produktu
    //  sprawdzająca if/czy jest lub nie produkt  w tablicy cartItems, która zawiera
    //  wszystkie obiekty klasy cartItem
    //  hasProduct szuka czy id podanego produktu równa się id produktu w klasie cartItems,
    //  jeśli tak to
    //  odpowiedz jest tak has, tak zawiera i zwraca nazwę produktu z odpowiednim id produktu
    //  pod postacią zmiennej CartItem cartItem

    private CartItem findCartItemByProduct(Product product) {
        for (CartItem cartItem : cartItems) {
            if (cartItem.hasProduct(product)) {
                return cartItem;
            }
        }
        return null;
    }

    //  metoda ta powinna
    //  dodawać nowy obiekt `CartItem` do tablicy `cartItems`. Przy
    //  dodawaniu drugiego egzemplarza produktu pamiętaj o zwiększaniu jego ilości.
    public void addProduct(Product product, int quantity){
        CartItem cartItem = findCartItemByProduct(product);
        if(cartItem != null){
            //Przy dodawaniu drugiego egzemplarza produktu pamiętaj o zwiększaniu jego ilości czyli
            // użyj metody add gdzie jest this.quality = this.quantity + quantity;
            cartItem.addQuantity(quantity);
        } else {
            // nowy obiekt cartItem ( stwórz go gdy jeszcze nie istnieje w tablicy cartItems
            cartItem = new CartItem(product,quantity);
            // do tablicy cartItems
            this.cartItems = Arrays.copyOf(this.cartItems, this.cartItems.length +1);
            this.cartItems[cartItems.length-1] = cartItem;
        }
    }
    public void removeProduct(Product product){

        CartItem [] finalCartItems = new CartItem[0]; // tablica do której przeniosę
        // niechciane, do usunięcia produkty
        // jeśli nie ma produktu w tablicy cartItems to dodaj do finalCartItems[] bo i tak nie chcemy
        // tego produktu w docelowej tablicy cartItems[] bo ta metoda ma usuwać to co zostanie
        // podane pod obiektem Product product. dodanie do nowej tablicy przez użycie Arrays.copyOf
        // i w wydłużenie długości tablicy o 1 tak by można było zacząć coś do niej wkładać.
        for(CartItem cartItem : cartItems){
            if(!cartItem.hasProduct(product)){
                finalCartItems = Arrays.copyOf(finalCartItems,finalCartItems.length + 1);
                finalCartItems[finalCartItems.length -1] = cartItem;
            }
        }
        // removeProduct czyli przypisanie podanego produktu do nowej
        // zmiennej finalCartItems[] czyli do nowej tablicy
        // co spowoduje, że przestanie być w pierwszej tablicy cartItems[]
        this.cartItems = finalCartItems;
    }

    //  * `updateProduct(Product product, int quantity)` – metoda ta powinna
    //  zmieniać ilość danego produktu w koszyku.
    public void updateProduct (Product product, int quantity){
        CartItem cartItem = findCartItemByProduct(product);
        if(cartItem != null){
            cartItem.getQuantity(quantity);
        }
    }

    //  * `getTotalQuantity()` – metoda ta ma zwracać łączną
    //  ilość wszystkich produktów w koszyku.
    public int getTotalQuantity(){
        int totalQuantity = 0;
        // for each zwiększa i dodaje ilość SPRAWDŹ TO
        for(CartItem cartItem : cartItems){
            totalQuantity = totalQuantity + cartItem.getQuantity();
        }
        return totalQuantity;
    }

    // * `getTotalSum()` – metoda ta ma zwracać łączną
    // wartość czyli cenę wszystkich produktów w koszyku.
    public double getTotalSum(){
        double totalSum = 0;
        for (CartItem cartItem : cartItems){
            totalSum = totalSum + cartItem.getTotalSumForCartItem();

        }
        return totalSum;
    }

    //  * `printReceipt()` – metoda drukująca paragon.
//  Na paragonie powinno się znaleźć: lista wszystkich
//  produktów, wraz z ich id, nazwą, ceną, ilością i łączną ceną,
//  łączna kwota za wszystkie produkty znajdujące się w koszyku.
//  Zwracaj ciąg znaków w postaci:
//
//```
//1: Produkt 1, 2x2.5 = 5.0
//2: Produkt 2, 3x12.0 = 36.0
//3: Produkt 3, 1x1 = 1
//---
//Razem: 42.00
    // receipt  - paragon
    public void printReceipt(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < cartItems.length; i++) {
            CartItem receipt = cartItems[i];
            stringBuilder.append(i + 1)
                    .append(": ")
                    .append(receipt.getProduct().getName())
                    .append(", ")
                    .append(receipt.getQuantity())
                    .append(" x ")
                    .append(receipt.getProduct().getPrice())
                    .append(" = ")
                    .append(receipt.getTotalSumForCartItem())
                    .append("\n");
        }
        stringBuilder.append("---------------\n")
                .append("Razem: ")
                .append(getTotalSum())
                .append("\n")
                .append( "Całkowita ilość produktów: ")
                .append(getTotalQuantity());
        System.out.println(stringBuilder);
    }
}
