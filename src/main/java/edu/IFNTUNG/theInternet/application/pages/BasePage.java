package edu.IFNTUNG.theInternet.application.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    private static final long TIME_TO_WAIT = 60;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(TIME_TO_WAIT));
    }

    protected void waitForVisibilityOfElement(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected WebElement find(By locator){
        return driver.findElement(locator);
    }

    protected void type(String text, By locator){
        waitForVisibilityOfElement(locator);
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    protected void click(By locator){
        waitForVisibilityOfElement(locator);
        find(locator).click();
    }

    protected String getText(By locator){
        return find(locator).getText();
    }

    protected void waitForTextToBePresent(By locator, String text){
        wait.until(ExpectedConditions.textToBe(locator, text));
    }
}
