package oop.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        account.withdraw(2000);
        account.deposit(2000);
        account.withdraw(5000);

        System.out.println("잔액: " + account.balance);
    }
}
