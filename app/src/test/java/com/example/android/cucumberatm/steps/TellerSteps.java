package com.example.android.cucumberatm.steps;

import com.example.android.cucumberatm.support.KnowsTheAccount;
import com.example.android.cucumberatm.support.KnowsTheTeller;

import cucumber.api.java.en.When;

/**
 * Created by Elorri on 24/06/2016.
 */

public class TellerSteps {
    private final KnowsTheTeller tellerHelper;
    private final KnowsTheAccount accountHelper;

    public TellerSteps(KnowsTheTeller tellerHelper, KnowsTheAccount accountHelper) {
        this.tellerHelper = tellerHelper;
        this.accountHelper=accountHelper;
    }


    @When("^I withdraw \\$(\\d+)$")
    public void iWithdraw$(int dollars) throws Throwable {
        tellerHelper.getTeller().withdrawFrom(accountHelper.getMyAccount(), dollars);
    }
}
