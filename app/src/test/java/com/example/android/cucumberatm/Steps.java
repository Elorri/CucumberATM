package com.example.android.cucumberatm;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Elorri on 22/06/2016.
 */

public class Steps {

    class Account {

        public void deposit(int amount) {
        }

        public int getBalance() {
            return 0;
        }
    }

    @Given("^I have deposited \\$(\\d+) in my account$")
    public void iHaveDeposited$InMyAccount(int amount) throws Throwable {
        Account myAccount = new Account();
        myAccount.deposit(amount);
        Assert.assertEquals("Incorrect account balance -",
                amount, myAccount.getBalance());
    }

    @When("^I request \\$(\\d+)$")
    public void iRequest$(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}