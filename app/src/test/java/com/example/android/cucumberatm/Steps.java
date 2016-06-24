package com.example.android.cucumberatm;

import org.junit.Assert;

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


    private final KnowsMyAccount helper;

    class Account {

        private Money balance;

        void deposit(Money amount) {
            balance = balance.add(amount);
        }

        Money getBalance() {
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

        public Money add(Money amount) {
            return null;
        }
    }

    public class MoneyConverter extends Transformer<Money> {

        @Override
        public Money transform(String amount) {
            String[] numbers = amount.substring(1).split("\\.");
            int dollars = Integer.parseInt(numbers[0]);
            int cents = Integer.parseInt(numbers[1]);
            return new Money(dollars, cents);
        }
    }


    class Teller {
        public void withdrawFrom(Account account, int dollars) {
        }
    }

    class KnowsMyAccount {
        private Account myAccount;
        public Account getMyAccount() {
            if (myAccount == null){
                myAccount = new Account();
            }
            return myAccount;
        }
    }

    public Steps() {
        helper = new KnowsMyAccount();
    }


    @Given("^I have deposited (\\$\\d+\\.\\d+) in my account$")
    public void iHaveDeposited$InMyAccount(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        helper.getMyAccount().deposit(amount);
        Assert.assertEquals("Incorrect account balance -",
                amount, helper.getMyAccount().getBalance());
    }



    @When("^I withdraw \\$(\\d+)$")
    public void iWithdraw$(int dollars) throws Throwable {
        Teller teller = new Teller();
        teller.withdrawFrom(helper.getMyAccount(), dollars);
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}