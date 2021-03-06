package com.example.android.cucumberatm.nicebank;

import com.example.android.cucumberatm.R;
import com.example.android.cucumberatm.hooks.ServerHooks;

/**
 * Created by Elorri on 26/06/2016.
 * This class is the controller, it will be the equivalent of a fragment or activity and can
 * implements differents interfaces like the Teller here.
 * This class would need nespresso dependencies
 */

public class AtmUserInterface implements Teller {


    @Override
    public void withdrawFrom(Account account, int dollars) {
        //get the home page or screen
        webDriver.get("http://localhost:" + ServerHooks.PORT);
        setContentView(R.layout.atm_user_interface); //??

        //find the textfield and fill it with the amount to withdraw
        webDriver.findElement(By.id("Amount")).sendKeys(String.valueOf(dollars));

        //click the withdraw button
        webDriver.findElement(By.id("Withdraw")).click();
    }

    @Override
    public boolean isDisplaying(String message) {
        List<WebElement> list = webDriver
                .findElements(By.xpath("//*[contains(text(),'" + message + "')]"));
        return (list.size() > 0);
    }

    public void type(int amount) {
        webDriver.get("http://localhost:" + hooks.ServerHooks.PORT);
        WebElement input = webDriver.findElement(By.id("amount"));
        String amountString = String.valueOf(amount);
        input.sendKeys(amountString);
    }
}
