package com.example.android.cucumberatm;

import org.junit.Assert;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.Transformer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Elorri on 22/06/2016.
 */

public class Steps {


    class Account {

        private Money balance = new Money();

        void deposit(int amount) {
            balance = balance.add(amount);
        }

        int getBalance() {
            return balance;
        }
    }

    class Money {

        private final int dollars;
        private final int cents;

        Money(int dollars, int cents) {
            this.dollars = dollars;
            this.cents = cents;
        }
    }

    public class MoneyConverter extends Transformer<Money> {

        @Override
        public Money transform(String amount) {
            String[] numbers = amount.split("\\.");
            int dollars = Integer.parseInt(numbers[0]);
            int cents = Integer.parseInt(numbers[1]);
            return new Money(dollars, cents);
        }
    }


    @Given("^I have deposited \$(\\d+)\.(\\d+) in my account$")
    public void iHaveDeposited$InMyAccount(@Transform(MoneyConverter.class) Money amount) throws Throwable {
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