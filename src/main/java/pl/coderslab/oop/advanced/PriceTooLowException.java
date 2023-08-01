package pl.coderslab.oop.advanced;

public class PriceTooLowException extends RuntimeException{
    public PriceTooLowException(String message){
        super(message);
    }
}
