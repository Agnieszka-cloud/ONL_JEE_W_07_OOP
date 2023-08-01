package pl.coderslab.oop.attributes;
//W pliku `Main01.java` umieść w metodzie `main` kod, który:
//
//        1. Utworzy obiekt klasy `AccessModifier` i przypisze go do zmiennej `testAttribute`.
//        2. Sprawdź które z atrybutów klasy `AccessModifier` są dostępne.
public class Main01AccessModifier {

    public static void main(String[] args) {

        AccessModifier testAttribute = new AccessModifier();

        System.out.println(testAttribute.protectedAttribute);

        System.out.println(testAttribute.publicAttribute);

        //System.out.println(testAttribute.privateAttribute); nie jest dostępny
    }
}
