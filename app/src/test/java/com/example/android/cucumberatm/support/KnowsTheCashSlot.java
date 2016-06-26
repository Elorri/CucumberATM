package com.example.android.cucumberatm.support;

import com.example.android.cucumberatm.nicebank.CashSlot;

/**
 * Created by Elorri on 26/06/2016.
 */

public class KnowsTheCashSlot {
    private CashSlot cashSlot;

    public CashSlot getCashSlot() {
        if (cashSlot == null) {
            cashSlot = new CashSlot();
        }
        return cashSlot;
    }
}
