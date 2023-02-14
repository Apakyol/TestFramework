package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonMain {
    public AmazonMain() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//span[@class='icp-nav-flag icp-nav-flag-us icp-nav-flag-lop']")
    public WebElement english;

   // @FindBy(xpath = )
}
