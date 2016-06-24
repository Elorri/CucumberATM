package com.example.android.cucumberatm.steps;

import com.example.android.cucumberatm.support.KnowsTheDomain;
import com.example.android.cucumberatm.nicebank.Account;

import cucumber.api.java.en.When;

/**
 * Created by Elorri on 24/06/2016.
 */

public class TellerSteps {
    private final KnowsTheDomain helper;

    public TellerSteps(KnowsTheDomain helper) {
        this.helper = helper;
    }


    @When("^I withdraw \\$(\\d+)$")
    public void iWithdraw$(int dollars) throws Throwable {
        helper.getTeller().withdrawFrom(helper.getMyAccount(), dollars);
    }
}
