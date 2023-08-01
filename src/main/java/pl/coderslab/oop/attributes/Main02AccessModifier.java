package pl.coderslab.oop.attributes;
/*
## Zadanie 2

W pliku `Main02.java`, w metodzie `main`, utwórz obiekt
klasy `AccessModifier` o nazwie `testAttribute`,
a następnie ustaw i wyświetl wszystkie wartości,
które są możliwe do ustawienia.

*/

public class Main02AccessModifier {

    public static void main(String[] args) {
        AccessModifier testAttributes = new AccessModifier();
        testAttributes.publicAttribute = "publiczny atrybut";
        testAttributes.protectedAttribute  = "chroniony atrybut";
        System.out.println(testAttributes.publicAttribute);
        System.out.println(testAttributes.protectedAttribute);
    }
}
