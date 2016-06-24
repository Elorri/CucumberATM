package com.example.android.cucumberatm;

import org.junit.Assert;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Elorri on 22/06/2016.
 */

public class Steps {



    class Account {

        private Money balance = new Money();

        public void deposit(int amount) {
            balance = balance.add(amount);
        }

        public int getBalance() {
            return balance;
        }
    }

    public Money(String amount) {
        Pattern pattern = Pattern.compile("^[^\\d]*([\\d]+)\\.([\\d][\\d])$");
        Matcher matcher = pattern.matcher(amount);
        matcher.find();
        this.dollars = Integer.parseInt(matcher.group(1));
        this.cents = Integer.parseInt(matcher.group(2));
    }


    @Given("^I have deposited \$(\\d+)\.(\\d+) in my account$")
    public void iHaveDeposited$InMyAccount(int dollars, int cents) throws Throwable {
        Account myAccount = new Account();
        Money amount = new Money(dollars, cents);
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