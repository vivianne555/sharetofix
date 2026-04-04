package org.example.Chat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class String {
    WebDriver driver;
    WebElement element;
    java.lang.String projectPath = System.getProperty("user.dir");
    @BeforeClass
    public void beforeClass(){
        System.getProperty("webdriver.gecko.driver", projectPath+ "\\browserDrivers\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

    }
    @Test
    public void TC_02_Title(){

    }
}