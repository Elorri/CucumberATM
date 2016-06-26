package com.example.android.cucumberatm.hooks;

import com.example.android.cucumberatm.nicebank.TransactionQueue;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by Elorri on 26/06/2016.
 */

public class ResetHooks {

    @Before
    public void reset() {
        TransactionQueue.clear();
    }

    @After
    public void rollback() {
        Base.rollbackTransaction();
    }
}