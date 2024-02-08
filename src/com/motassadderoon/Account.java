package com.motassadderoon;

public class Account {
    private float balance;

    public float getBalance() {
        return balance;
    }

    private void setBalance(float balance) {
        if (balance < 0) {
            throw new IllegalArgumentException();
        } else {
            this.balance = balance;
        }
    }

    public void withDraw(float amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        } else {
            setBalance(balance - amount);
        }
    }

    public void deposit(float amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        } else {
            setBalance(balance + amount);
        }
    }
}
