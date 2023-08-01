package pl.coderslab.oop.constructor;

public class BankAccount {
    private double balance;
    /*private double number = 438989898;
    private double cash = 0.0;*/
    //static  private int nextAccountNumber = 1;


    public BankAccount() {

        balance = 0.0;

    }

    /*public double getNumber() {
        return this.number;
    }

    public double getCash() {
        return this.cash;
    }*/

    public void depositCash(double amount) {
        if (amount >= 0) {
            balance = balance + amount;
            //if (amount > 0) {
            //   this.cash = this.cash + amount;
        } else {
            System.out.println("Niewłaściwe dane, podaj liczbę dodatnią");
        }
    }
    public void withdrawCash(double amount) {

        if(amount <= balance){
            balance = balance - amount;
        }
        else{balance = balance - amount;
            System.err.println("not enough money on the account.");
            System.out.println("jpijpoijpoi");
        }
        /*if (amount >= 0) {
            this.cash = this.cash - amount;
        } else {

        }*/
    }

    public double getBalance() {
        return balance;
    }
}


