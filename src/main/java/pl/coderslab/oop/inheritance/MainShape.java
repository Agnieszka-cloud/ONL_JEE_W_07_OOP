package pl.coderslab.oop.inheritance;

public class MainShape {

    public static void main(String[]args){
        //obiekt
        Shape shape1 = new Shape(6,7,"yellow");
        Shape shape2 = new Shape(3,3,"red");
        double distance = shape1.getDistance(shape2);
        System.out.println("odległość między punktami:  " + distance);
        System.out.println(shape1.getDescription());
        System.out.println(shape2.getDescription());
    }
}
