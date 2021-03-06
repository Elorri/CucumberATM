package com.example.android.cucumberatm.steps;

import com.example.android.cucumberatm.nicebank.Money;
import com.example.android.cucumberatm.support.KnowsTheAccount;

import org.junit.Assert;

import cucumber.api.Transform;
import cucumber.api.Transformer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by Elorri on 24/06/2016.
 */

public class AccountSteps {

    private final KnowsTheAccount helper;

    public AccountSteps(KnowsTheAccount helper) {
        this.helper = helper;
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

    @Given("^my account has been credited with (\\$\\d+\\.\\d+)$")
    public void myAccountHasBeenCreditedWith$(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        helper.getMyAccount().credit(amount);
    }

    @Then("^the balance of my account should be (\\$\\d+\\.\\d+)$")
    public void theBalanceOfMyAccountShouldBe$(@Transform(MoneyConverter.class) Money amount)
            throws Throwable {
        int timeoutMilliSecs = 3000;
        int pollIntervalMilliSecs = 100;
        while (!helper.getMyAccount().getBalance().equals(amount)
                && timeoutMilliSecs > 0){
            Thread.sleep(pollIntervalMilliSecs);
            timeoutMilliSecs -= pollIntervalMilliSecs;
        }
        Assert.assertEquals("Incorrect account balance -", amount, helper.getMyAccount().getBalance());
    }
}
