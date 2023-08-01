package pl.coderslab.oop.constructor;

public class MainBankAccountYT {
    public static void main(String[] args){


        BankAccountYT customer1 = new BankAccountYT();

        customer1.depositCash(-900);
        customer1.withdrawCash(900);
        System.out.println(customer1.getBalance());

        BankAccountYT customer2 = new BankAccountYT();

        customer2.depositCash(1200);
        customer2.withdrawCash(800);
        System.out.println(customer2.getBalance());

    }

}
