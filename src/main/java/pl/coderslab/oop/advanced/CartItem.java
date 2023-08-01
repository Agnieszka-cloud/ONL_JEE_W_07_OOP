package pl.coderslab.oop.advanced;
// ## Zadanie 4
//
//1. Utwórz klasę `CartItem` zawierającą dwa pola:
//    * pole product – referencja do obiektu typu **Product**
//    * pole quantity – (int) – ilość powyższego produktu w koszyku.
//
//2. Utwórz klasę `ShoppingCart`. Klasa ta ma posiadać następujące
// atrybuty:
//  * `cartItems` – tablica z obiektami klasy `CartItem`.
//
// Do tej zmiennej nie powinno być ustawionych ani getterów,
// ani setterów.
//
// Klasa ShoppingCart powinna mieć też następujące metody:
//
//  * `addProduct(Product product, int quantity)` – metoda ta powinna dodawać nowy obiekt `CartItem` do tablicy `cartItems`. Przy dodawaniu drugiego egzemplarza produktu pamiętaj o zwiększaniu jego ilości.
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


//1. Utwórz klasę `CartItem` zawierającą dwa pola:
public class CartItem {
    // * pole product – referencja do obiektu typu **Product**
    private Product product;
    // * pole quantity – (int) – ilość powyższego produktu w koszyku.
    private int quantity;

    // konstruktor z parametrami produkty i ich ilość
    public CartItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }
    public Product getProduct(){
        return product;
    }
    public int getQuantity(int quantity) {
        return this.quantity;
    }
    public int getQuantity() {
        return this.quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // metoda typu boolean sprawdzająca CZY jest obiekt Product product
    public boolean hasProduct(Product product){
        return product.getId() == this.product.getId();
    }

    // metoda na dodawanie do ilości (quantity) istniejących już produktów w zmiennej int quantity
    public void addQuantity(int quantity){
        this.quantity = this.quantity + quantity;
    }

    // metoda na policzenie ile wynosi cena za wszystkie produkty razem
    public double getTotalSumForCartItem(){
        return this.quantity * product.getPrice();
    }
}