package pl.coderslab.oop.constructor;

public class MainBank {
    public static void main(String[] args){

        BankAccount customer1 = new BankAccount();

        customer1.depositCash(-900);
        customer1.withdrawCash(900);
        System.out.println(customer1.getBalance());

        BankAccount customer2 = new BankAccount();

        customer2.depositCash(1200);
        customer2.withdrawCash(800);
        System.out.println(customer2.getBalance());

    }
}
