package com.example.android.cucumberatm.steps;

import com.example.android.cucumberatm.support.KnowsTheDomain;

import cucumber.api.java.en.When;

/**
 * Created by Elorri on 24/06/2016.
 */

public class TellerSteps {
    private final KnowsTheDomain helper;

    public TellerSteps() {
        helper = new KnowsTheDomain();
    }


    @When("^I withdraw \\$(\\d+)$")
    public void iWithdraw$(int dollars) throws Throwable {
        helper.getTeller().withdrawFrom(helper.getMyAccount(), dollars);
    }
}
