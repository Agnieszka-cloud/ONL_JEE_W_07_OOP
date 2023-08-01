package pl.coderslab.oop.methods;
//## Zadanie 1
//Utwórz klasę `Product`, dodaj w niej atrybut `name`.
//Dodaj metody `setName` (ustawiającą `name`)
// oraz `getName` (zwracającą `name`).

//klasa
public class Product {

    //atrybut klasy
    private String name = "buty";

    //pobieranie z bazy więc wraca z bazy
    public String getName (){
        return name;
    }

    // wypełnianie danymi do bazy
    public void setName(String name) {
        this.name = name;
    }

    //Krótko o metodzie toString():
    // służy do przedstawiania zawartości obiektów,
    // powinna zwracać napis reprezentujący zawartość
    // obiektu,
    // możemy sami definiować, jak będzie wyglądała
    // ta metoda.
    public String toString(){

        return this.name;
    }
}
