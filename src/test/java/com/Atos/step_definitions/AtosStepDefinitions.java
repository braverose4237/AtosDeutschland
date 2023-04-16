package com.Atos.step_definitions;

import com.Atos.pages.BasePageAtos;
import com.Atos.utilities.BrowserUtils;
import com.Atos.utilities.ConfigurationReader;
import com.Atos.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AtosStepDefinitions {
    BasePageAtos basePage=new BasePageAtos();
    @When("user is on the Atos Page")
    public void user_is_on_the_atos_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.sleep(2);
    }
    @When("user deny to Cookies")
    public void user_deny_to_cookies() {
        basePage.CookiesDeny.click();
        BrowserUtils.sleep(1);

    }
    @When("user click Facebook Link")
    public void user_click_facebook_link() {
       basePage.facebook.click();
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        //wait.until(ExpectedConditions.elementToBeClickable(basePage.facebook));
        //basePage.facebook.click();
        BrowserUtils.sleep(2);

    }
    @Then("check user on the facebook WebSite")
    public void check_user_on_the_facebook_web_site() {

        Assert.assertTrue(BrowserUtils.linkcheck().contains("facebook"));
    }
    @When("user click instagram Link")
    public void user_click_ınstagram_link() {
        basePage.instagram.click();
        BrowserUtils.sleep(2);
    }
    @Then("check user on the instagram WebSite")
    public void check_user_on_the_ınstagram_web_site() {
        Assert.assertTrue(BrowserUtils.linkcheck().contains("instagram"));
    }
    @When("user click Xing Link")
    public void user_click_xing_link() {
       basePage.xing.click();
        BrowserUtils.sleep(2);
    }
    @Then("check user on the Xing WebSite")
    public void check_user_on_the_xing_web_site() {
        Assert.assertTrue(BrowserUtils.linkcheck().contains("xing"));
    }

}
