package edu.IFNTUNG.theInternet.application.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    private By usernameField = By.xpath("//input[@id='username']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By loginButton = By.xpath("//button[@class='radius']");
    private By errorMessage = By.xpath("//div[@class='flash error']");
    private By successMessage = By.xpath("//div[@class='flash success']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public String getErrorMessage(){
        return getText(errorMessage);
    }

    public String getSuccessMessage(){
        return getText(successMessage);
    }

    public LoginPage enterUsernameAndPassword(String username, String password){
        type(username,usernameField);
        type(password,passwordField);
        return this;
    }

    public SecurePage clickLogin (){
        click(loginButton);
        return new SecurePage(driver);
    }

    public LoginPage clickLoginButton (){
        click(loginButton);
        return this;
    }
}
