package com.luxoft.rozetka.steps.serenity;

import com.luxoft.rozetka.pages.HomePage;
import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by APopichenko on 04.04.2017.
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/consult_dictionary/LookupADefinition.feature")
public class SearchUserSteps {

    WebDriver webDriver;
    HomePage homePage;

    @Given("^the page is open with url (.*)$")
    public void thePageIsOpen(String url) {
        homePage.updateUrlWithBaseUrlIfDefined(url);
      homePage.open();
        assertThat(homePage.getTitle()).containsIgnoringCase("ROZETKA");
    }

    @When("^User search for (.*)$")
    public void User_search_for_cucumber(String stringToFind) throws InterruptedException {
        // Express the Regexp above with the code you wish you had
        webDriver.findElement(By.cssSelector("#rz-search > form > div.rz-header-search-inner > div.rz-header-search-input-text-wrap.sprite-side > input")).sendKeys(stringToFind);
        webDriver.findElement(By.cssSelector("#rz-search > form > span > span > button")).click();
        webDriver.wait(4000);
        assertThat(homePage.getTitle()).containsIgnoringCase("cucumber");
    }

    @Then("^User browser's title should contain \"([^\"]*)\"$")
    public void User_browser_s_title_should_contain(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}
