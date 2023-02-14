package com.amazon.step_definitions;

import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import static java.lang.Thread.sleep;

public class AmazonSearch {
    @Given("user is on the search page iphone")
    public void user_is_on_the_search_page_iphone() {
        Driver.getDriver().get(ConfigurationReader.keyValue("url"));

    }
    @When("user search for iPhone")
    public void user_search_for_i_phone() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Amazon.com : iphone");
        System.out.println("if he finds iphone again");
    }
    @Then("he can find iphone he likes")
    public void he_can_find_iphone_he_likes() {
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("iphone"+ Keys.ENTER);
    }

    @Given("user is on the search page")
    public void user_is_on_the_search_page() {
        Driver.getDriver().get(ConfigurationReader.keyValue("url"));
    }
    @When("user search for shoes")

    public void user_search_for_shoes() {
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("iphone"+ Keys.ENTER);

    }
    @Then("he can find shoes he likes")
    public void he_can_find_shoes_he_likes(Thread thread) throws InterruptedException {
        sleep(3000);
        Assert.assertEquals(Driver.getDriver().getTitle(), "Amazon.com : iphone");
        System.out.println("if he finds iphone");



    }
}
