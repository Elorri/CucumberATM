package com.example.android.cucumberatm.nicebank;

import static java.lang.Integer.getInteger;

/**
 * Created by Elorri on 24/06/2016.
 */

public class Account extends Model {

    public Account() {}
    public Account(int number){
        setInteger("number", number);
        setString("balance", "0.00");
    }

    private TransactionQueue queue = new TransactionQueue();

    public void credit(Money amount) {
        queue.write("+" + amount.toString() + "," + getNumber());
    }

    public void debit(int dollars) {
        Money amount = new Money(dollars, 0);
        queue.write("-" + amount.toString() + "," + getNumber());
    }

    public int getNumber() {
        return getInteger("number");
    }

    public Money getBalance() {
        refresh();
        return new Money(getString("balance"));
    }

    public void setBalance(Money amount) {
        setString("balance", amount.toString().substring(1));
        saveIt();
    }
}
