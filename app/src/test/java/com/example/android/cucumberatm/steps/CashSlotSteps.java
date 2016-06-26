package com.example.android.cucumberatm.steps;

import com.example.android.cucumberatm.nicebank.CashSlot;

import org.junit.Assert;

import cucumber.api.java.en.Then;

/**
 * Created by Elorri on 22/06/2016.
 */

public class CashSlotSteps {

    CashSlot cashSlot;


    public CashSlotSteps(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }


    @Then("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int dollars) throws Throwable {
        Assert.assertEquals("Incorrect amount dispensed -", dollars, cashSlot.getContents());
    }
}