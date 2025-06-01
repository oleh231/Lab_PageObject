package edu.IFNTUNG.theInternet.tests;

import edu.IFNTUNG.theInternet.application.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogInValidTest extends BaseTest{
    private static String SUCCESS_MESSAGE = "Secure Area";
    @Test
    public void LoginTest(){
    String actualMessage = new LoginPage(driver)
                .enterUsernameAndPassword("tomsmith", "SuperSecretPassword!")
                .clickLogin()
                .getActualMessage();
        Assert.assertTrue(actualMessage.contains(SUCCESS_MESSAGE));
    }
}
