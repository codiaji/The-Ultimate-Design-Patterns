package com.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Account myAcc = new Account();
        myAcc.deposit(10);
        myAcc.deposit(20);
        myAcc.withDraw(15);
        System.out.println("myAcc.getBalance() = " + myAcc.getBalance());
    }

    public static TaxCalculator getTaxCalculator() {
        return new TaxCalculator2019();
    }
}
