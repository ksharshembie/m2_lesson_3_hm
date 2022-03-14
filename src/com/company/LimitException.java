package com.company;

public class LimitException extends Exception {
    private double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        System.err.println(message + remainingAmount);
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}
