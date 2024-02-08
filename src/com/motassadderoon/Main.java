package com.motassadderoon;

public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator = getTaxCalculator();
        System.out.println("calculator.calculateTax() = " + calculator.calculateTax());

    }

    public static TaxCalculator getTaxCalculator() {
        return new TaxCalculator2019();
    }
}
