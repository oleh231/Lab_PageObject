package edu.IFNTUNG.theInternet.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver driver;
    private static final String THEINTERNET_URL = "https://the-internet.herokuapp.com/login";

    @BeforeTest
    public void createDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(THEINTERNET_URL);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void closeDriver(){
        driver.quit();
    }
}
