package com.example.android.cucumberatm.support;

import android.accounts.Account;

/**
 * Created by Elorri on 24/06/2016.
 */

public class KnowsTheDomain {
    private Account myAccount;
    private CashSlot cashSlot;
    private Teller teller;

    public Account getMyAccount() {
        if (myAccount == null){
            myAccount = new Account();
        }
        return myAccount;
    }
    public CashSlot getCashSlot() {
        if (cashSlot == null){
            cashSlot = new CashSlot();
        }
        return cashSlot;
    }

    public Teller getTeller() {
        if (teller == null){
            teller = new Teller(getCashSlot());
        }
        return teller;
    }

}