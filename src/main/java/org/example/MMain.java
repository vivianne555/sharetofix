package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// in ra size() của locator USER_NAME

public class MMain {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bidv.net/bidvdirectsit");
        WebElement element = driver.findElement(By.xpath(Locator.USER_NAME));
        String ext = element.getText();
        element.click();
        element.sendKeys("123456");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
    }
}