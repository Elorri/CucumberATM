package com.example.android.cucumberatm.nicebank;

/**
 * Created by Elorri on 24/06/2016.
 */

public class Teller {
    private CashSlot cashSlot;
    public Teller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }
    public void withdrawFrom(Account account, int dollars) {
        cashSlot.dispense(dollars);
    }
}
