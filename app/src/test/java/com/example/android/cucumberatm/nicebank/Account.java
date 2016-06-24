package com.example.android.cucumberatm.nicebank;

import com.example.android.cucumberatm.Steps;

/**
 * Created by Elorri on 24/06/2016.
 */

class Account {

    private Steps.Money balance;

    void deposit(Steps.Money amount) {
        balance = balance.add(amount);
    }

    Steps.Money getBalance() {
        return balance;
    }
}
