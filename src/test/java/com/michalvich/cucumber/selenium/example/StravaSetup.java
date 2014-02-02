package com.michalvich.cucumber.selenium.example;

import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.Assert.assertTrue;

public class StravaSetup {

    protected WebDriver driver;
    @Before
    public void setUp() {
        driver = new HtmlUnitDriver();
    }
	@Given("^the page is open2 \"([^\"]*)\"$")
	public void the_page_is_open(String page) throws Throwable {
		driver.get(page);
	}

	@When("^I search for2 \"([^\"]*)\"$")
	public void I_search_for2(String search) throws Throwable {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys(search);
		element.submit();
	}

	@Then("^a browser title should contains2 \"([^\"]*)\"$")
	public void a_browser_title_should_contains2(String text) throws Throwable {
        System.out.println("Current title:" + driver.getTitle() );
        assertTrue(driver.getTitle().contains(text));

	}

}
