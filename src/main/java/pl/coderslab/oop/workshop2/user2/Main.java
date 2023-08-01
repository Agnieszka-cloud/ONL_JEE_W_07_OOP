package pl.coderslab.oop.workshop2.user2;

public class Main {
    public static void main (String[] args){
        System.out.println(potęgowanie(2,3));
    }
    public static int potęgowanie(int num1, int num2) {
        int result = 1;
        for (int i = 0 ; i < num2; i++) {
            result = num1 * result;
        }
        return result;
    }
}
