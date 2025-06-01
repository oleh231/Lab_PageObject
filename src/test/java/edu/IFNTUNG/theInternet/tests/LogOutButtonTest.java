package edu.IFNTUNG.theInternet.tests;

import edu.IFNTUNG.theInternet.application.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogOutButtonTest extends BaseTest{
    private static String SUCCESS_MESSAGE = "You logged out of the secure area!";
    @Test
    public void LogOutTest(){
        String actualMessage = new LoginPage(driver)
                .enterUsernameAndPassword("tomsmith", "SuperSecretPassword!")
                .clickLogin()
                .clickLogOut()
                .getSuccessMessage();
        Assert.assertTrue(actualMessage.contains(SUCCESS_MESSAGE));
    }
}
