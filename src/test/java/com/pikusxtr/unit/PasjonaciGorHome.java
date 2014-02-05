package com.pikusxtr.unit;

/**
 * Created by T5500 on 04.02.14.
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.junit.Assert.assertTrue;


public class PasjonaciGorHome {
    public static void main(String[] args) {
        // Create a new instance of the html unit driver
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = new HtmlUnitDriver();

        // And now use this to visit Google
        driver.get("http://allegro.pl/");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.id("main-search-text"));
        assertTrue(element.getAttribute("placeholder").contains("czego szukasz"));
        assertTrue(element.getAttribute("value").isEmpty());
        System.out.println("palceholder value is: " + element.getAttribute("placeholder"));

  // Enter something to search for
        element.sendKeys("Zegarek");
        assertTrue(element.getAttribute("value").contentEquals("Zegarek"));
        System.out.println("palceholder value after text was entered is: " + element.getAttribute("placeholder"));
        System.out.println("element value is: " + element.getAttribute("value"));
        WebElement underSearchList = driver.findElement(By.xpath("//*[@id=\"main-search\"]/div[3]/div"));
        System.out.println("First under search list item=" + underSearchList.getAttribute("class") );
        // Now submit the form. WebDriver will find the form for us from the element
        //element.submit();

        // Check the title of the page

    }
}