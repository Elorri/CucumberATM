package com.example.android.cucumberatm.nicebank;

import android.accounts.*;

import com.example.android.cucumberatm.Steps;

/**
 * Created by Elorri on 24/06/2016.
 */

class Teller {
    private Steps.CashSlot cashSlot;
    public Teller(Steps.CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }
    public void withdrawFrom(android.accounts.Account account, int dollars) {
        cashSlot.dispense(dollars);
    }
}
