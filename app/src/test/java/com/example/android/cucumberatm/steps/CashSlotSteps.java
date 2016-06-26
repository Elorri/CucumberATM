package com.example.android.cucumberatm.steps;

import com.example.android.cucumberatm.support.KnowsTheCashSlot;

import org.junit.Assert;

import cucumber.api.java.en.Then;

/**
 * Created by Elorri on 22/06/2016.
 */

public class CashSlotSteps {

    private final KnowsTheCashSlot helper;


    public CashSlotSteps(KnowsTheCashSlot helper) {
        this.helper = helper;
    }


    @Then("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int dollars) throws Throwable {
        Assert.assertEquals("Incorrect amount dispensed -", dollars, helper.getCashSlot().getContents());
    }
}