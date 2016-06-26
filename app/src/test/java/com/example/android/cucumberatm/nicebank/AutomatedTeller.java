package com.example.android.cucumberatm.nicebank;

/**
 * Created by Elorri on 26/06/2016.
 */

public class AutomatedTeller implements Teller {
    private CashSlot cashSlot;

    public AutomatedTeller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    @Override
    public void withdrawFrom(Account account, int dollars) {
        account.debit(dollars);
        cashSlot.dispense(dollars);
    }
}
