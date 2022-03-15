package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        System.out.println("\nДепозит на счет " + sum);
        amount += sum;
        System.out.println("Остаток на счете " + amount);
    }

    public void withDraw(int sum) throws LimitException {
        if (amount > sum) {
            System.out.println("\nCнимаемая сумма " + sum);
            amount -= sum;
            System.out.println("Остаток на счете " + amount);
        } else if(amount < sum) {
            throw new LimitException("\nЗапрашиваемая сумма на снятие больше, " +
                    "\nчем остаток денег на счете.\nСнимаемая сумма ", amount);
        }
        if  (amount == sum){
            amount-= sum;
            System.out.println("Остаток на счете " + amount);
        }
    }
}
