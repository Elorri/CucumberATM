package com.example.android.cucumberatm.steps;

import com.example.android.cucumberatm.nicebank.Money;
import com.example.android.cucumberatm.support.KnowsTheDomain;

import org.junit.Assert;

import cucumber.api.Transform;
import cucumber.api.Transformer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Elorri on 22/06/2016.
 */

public class CashSlotSteps {

    private final KnowsTheDomain helper;


    public CashSlotSteps(KnowsTheDomain helper) {
        this.helper = helper;
    }


    @Then("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int dollars) throws Throwable {
        Assert.assertEquals("Incorrect amount dispensed -", dollars, helper.getCashSlot().getContents());
    }
}