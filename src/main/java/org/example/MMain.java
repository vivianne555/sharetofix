package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.google.common.base.StandardSystemProperty.USER_NAME;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bidv.net/bidvdirectsit");
        WebElement element = driver.findElement(By.xpath(USER_NAME));
        try {
            Thread.sleep(10000);
        } catch ( InterruptedException e){
            throw new RuntimeException(e);
        }

    }
}
