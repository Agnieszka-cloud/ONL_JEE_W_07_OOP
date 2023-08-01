package pl.coderslab.oop.inheritance;

public class MainCircle {
    public static void main(String[]args ){

        Circle circle = new Circle(34,48,"red",6);

        Shape shape = new Shape(3,4,"pink");

        System.out.println("powierzchnia koła wynosi: " + circle.getArea());
        System.out.println("obwód koła wynosi: " + circle.getCircuit());
        System.out.println(circle.getDescription());

        double circleDistance = shape.getDistance(circle);

        System.out.println("odległość od punktu do koła wynosi: " + circleDistance);
    }
}
