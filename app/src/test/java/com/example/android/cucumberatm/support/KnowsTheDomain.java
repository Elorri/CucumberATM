package com.example.android.cucumberatm.support;

import com.example.android.cucumberatm.nicebank.Account;
import com.example.android.cucumberatm.nicebank.AtmUserInterface;
import com.example.android.cucumberatm.nicebank.CashSlot;
import com.example.android.cucumberatm.nicebank.Teller;

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
            teller = new AtmUserInterface();
        }
        return teller;
    }

}