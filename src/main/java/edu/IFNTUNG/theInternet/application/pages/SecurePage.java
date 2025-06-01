package edu.IFNTUNG.theInternet.application.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage extends BasePage {
    public SecurePage(WebDriver driver) {
        super(driver);
    }
    private By successMessage = By.xpath("//h2");
    private By logoutButton = By.xpath("//a[@class='button secondary radius']");

    public String getActualMessage(){
        return getText(successMessage);
    }

    public LoginPage clickLogOut (){
        click(logoutButton);
        return new LoginPage(driver);
    }
}
