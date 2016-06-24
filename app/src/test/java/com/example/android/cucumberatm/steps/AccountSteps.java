package com.example.android.cucumberatm.steps;

import com.example.android.cucumberatm.nicebank.Money;
import com.example.android.cucumberatm.support.KnowsTheDomain;

import org.junit.Assert;

import cucumber.api.Transform;
import cucumber.api.Transformer;
import cucumber.api.java.en.Given;

/**
 * Created by Elorri on 24/06/2016.
 */

public class AccountSteps {

    private final KnowsTheDomain helper;

    public AccountSteps() {
        helper = new KnowsTheDomain();
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

    @Given("^I have deposited (\\$\\d+\\.\\d+) in my account$")
    public void iHaveDeposited$InMyAccount(@Transform(CashSlotSteps.MoneyConverter.class) Money amount) throws Throwable {
        helper.getMyAccount().deposit(amount);
        Assert.assertEquals("Incorrect account balance -", amount, helper.getMyAccount().getBalance());
    }
}
