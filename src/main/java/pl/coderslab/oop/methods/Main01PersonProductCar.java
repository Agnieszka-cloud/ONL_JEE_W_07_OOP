package pl.coderslab.oop.methods;
//W pliku `Main01.java` umieść w metodzie `main` kod,
// który utworzy obiekt klasy `Person` o nazwie `person`,
// a następnie
//ustawi za pomocą wcześniej utworzonych metod wszystkie
// atrybuty klasy.

public class Main01PersonProductCar {
    public static void main(String[] args){
        Person person = new Person("Jan","Kowalski");

        person.setName("Agnieszka");
        person.setSurname("Doberska");
        person.setAge(42);
        person.setGender('F');
        person.increaseAge();


        System.out.println(person.getFullName());
        System.out.println(person.age());
        System.out.println(person.getAllDataOfThePerson());


        Car car = new Car();
        car.setBrand("Honda, ");
        car.setModel("Civic, ");
        car.setPrice(100.000);
        System.out.println(car);


        Product product = new Product();
        System.out.println(product);
        System.out.println(product.toString());
    }
}
