package com.example.android.cucumberatm.nicebank;

/**
 * Created by Elorri on 24/06/2016.
 */

public class Account {

    private Money balance;

    public void deposit(Money amount) {
        balance = balance.add(amount);
    }

    public Money getBalance() {
        return balance;
    }
}
