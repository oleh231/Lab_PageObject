package edu.IFNTUNG.theInternet.tests;

import edu.IFNTUNG.theInternet.application.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginInvalNameTest extends BaseTest{
    private static String ERROR_MESSAGE = "Your username is invalid!";
    @Test
    public void LoginInvalTest(){
        String actualMessage = new LoginPage(driver)
                .enterUsernameAndPassword("oleh", "SuperSecretPassword!")
                .clickLoginButton()
                .getErrorMessage();
        Assert.assertTrue(actualMessage.contains(ERROR_MESSAGE));
    }
}
