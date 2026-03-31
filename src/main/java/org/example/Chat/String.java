package org.example.Chat;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
public class String {
    WebDriver driver;
    WebElement element;
    String projectPath = System.getProperty("user.dir");
    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.gecko.driver"+ "\\browserDrivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }
    @Test

}
