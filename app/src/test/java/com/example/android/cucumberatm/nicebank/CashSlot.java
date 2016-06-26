package com.example.android.cucumberatm.nicebank;

/**
 * Created by Elorri on 24/06/2016.
 */

public class CashSlot {
    private int contents;
    private int available;

    public int getContents() {
        return contents;
    }
    public void load(int dollars){
        available = dollars;
    }
    public void dispense(int requested){
        if (available >= requested) {
            contents = requested;

            available -= requested;
        } else {
            throw new RuntimeException("Insufficient ATM funds");
        }
    }
}
