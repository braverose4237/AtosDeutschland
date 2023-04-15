package com.Atos.pages;

import com.Atos.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//img[@class='alignleft wp-image-233333 lazy']")
    public WebElement instagram;

    @FindBy(xpath = "//img[@class='alignleft wp-image-92093 size-full lazy']")
    public WebElement xing;

    @FindBy(xpath = "//button[@class='cp_decline']")
    public WebElement CookiesDeny;

    @FindBy(xpath = "//img[@class='wp-image-56641 alignleft lazy']")
    public WebElement facebook;

}
