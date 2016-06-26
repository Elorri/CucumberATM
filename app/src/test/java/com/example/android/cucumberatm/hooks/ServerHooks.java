package com.example.android.cucumberatm.hooks;

import com.example.android.cucumberatm.nicebank.CashSlot;
import com.example.android.cucumberatm.support.KnowsTheAccount;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by Elorri on 26/06/2016.
 */

public class ServerHooks {

    public static final int PORT = 8887;
    private AtmServer server;

    public ServerHooks(KnowsTheAccount accountHelper, CashSlot cashSlot) {
        this.accountHelper = accountHelper;
        this.cashSlot = cashSlot;
    }

    @Before
    public void startServer() throws Exception {
        server = new AtmServer(PORT);
        server.start();
    }

    @After
    public void stopServer() throws Exception {
        server.stop();
    }

}
