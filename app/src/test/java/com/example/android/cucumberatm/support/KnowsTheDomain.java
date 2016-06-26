package com.example.android.cucumberatm.support;

import com.example.android.cucumberatm.nicebank.Account;
import com.example.android.cucumberatm.nicebank.EventFiringWebDriver;
import com.example.android.cucumberatm.nicebank.FirefoxDriver;

/**
 * Created by Elorri on 26/06/2016.
 */

public class KnowsTheDomain {

    private EventFiringWebDriver webDriver;

    public KnowsTheDomain() {
        if (!Base.hasConnection()){
            Base.open(
                    "com.mysql.jdbc.Driver",
                    "jdbc:mysql://localhost/bank",
                    "teller", "password");
        }
        Account.deleteAll();
    }

    public EventFiringWebDriver getWebDriver() {
        if (webDriver == null){
            webDriver = new EventFiringWebDriver(new FirefoxDriver());
        }
        return webDriver;
    }
}
