package org.example.Chat;
import java.lang.String;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selenium30th3 {
    WebDriver driver;
    WebElement element;
    String projectPath = System.getProperty("user.dir");

        @Test
        public void TC_01_Browser() {

            //Các hàm/method để thao tác với browser là thông qua biến driver
        driver.get("https://www.sendo.vn/sendofarm");
        driver.get("https://stage.gofevo.com/101/10954/group/Lindav2952");
        driver.close();
        driver.quit();
        WebElement emailTextbox = driver.findElement(By.id("email"));
        }
        public void TC_02_Element() {
            //Các hàm/method để thao tác với browser là thông qua biến element
            driver.findElement(By.xpath("//a"));
            driver.getCurrentUrl();
// không nên lưu
            driver.findElement(By.id("email")).click();
            // nên lưu nếu tái sd được
//        WebElement emailTextbox = driver.findElement(By.id("email"));
            // lấy source code tuyệt đối
            //Assert.assertEquals(homePageUrl, "https://demo.nopcommerce.com");
            //lấy tương đối
            String homePageUrl = driver.getPageSource();
            Assert.assertTrue(driver.getPageSource().contains("Welcome to our store"));

        }
    }
