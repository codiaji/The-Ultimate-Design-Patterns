package com.motassadderoon;

public class Main {
    public static void main(String[] args) {
        MailService mailService = new MailService();
        mailService.sendEmail();
    }

    public static TaxCalculator getTaxCalculator() {
        return new TaxCalculator2019();
    }
}
