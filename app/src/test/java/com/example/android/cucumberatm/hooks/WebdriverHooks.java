package com.example.android.cucumberatm.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;

/**
 * Created by Elorri on 26/06/2016.
 */

public class WebdriverHooks {

    @After
    public void finish(Scenario scenario) {
        try {
            byte[] screenshot =
                    helper.getWebDriver().getScreenshotAs(OutputType.BYTES);

            //embed method is a cucumber method that is able to save an image
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        } finally {
            helper.getWebDriver().close();
        }
    }
}
