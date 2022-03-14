package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(20000);
        int withDraw = 6000;
        while (account.getAmount() > 0) {
            try {
                account.withDraw(withDraw);
            } catch (LimitException e) {
                e.getMessage();
                account.setAmount(account.getAmount() - e.getRemainingAmount());
                System.out.println("Остаток на счете " + account.getAmount());
            }
        }
    }
}
