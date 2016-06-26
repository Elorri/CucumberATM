package com.example.android.cucumberatm.support;

import com.example.android.cucumberatm.nicebank.CashSlot;

/**
 * Created by Elorri on 26/06/2016.
 */

public class TestCashSlot extends CashSlot {
    private boolean faulty;

    public void injectFault() {
        faulty = true;
    }

    public void dispense(int dollars){
        if (faulty) {
            throw new RuntimeException("Out of order");
        } else {
            super.dispense(dollars);
        }
    }
}