package com.example.android.cucumberatm.support;

import com.example.android.cucumberatm.nicebank.Account;

/**
 * Created by Elorri on 26/06/2016.
 */

public class KnowsTheAccount {

    private Account myAccount;

    public Account getMyAccount() {
        if (myAccount == null){
            myAccount = new Account(1234);
        }
        return myAccount;
    }

}
