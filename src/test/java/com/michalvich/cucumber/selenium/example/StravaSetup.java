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

    public WebDriver driver;
    @Before
    public void setUp() {
        driver = new HtmlUnitDriver();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!Setup successful - Driver created!!!");
    }



}
