package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

// phai co thoi gian cho
// in ra size() của locator USER_NAME
// tìm xem attribute có id="username" => sau in ra " đây là thẻ input"
public class LamlaiBT1 {
    public static void main(String[] args) {
        String USER_NAME = "//input";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bidv.net/bidvdirectsit");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
            List<WebElement> name1 = driver.findElements(By.xpath(USER_NAME));
            System.out.println("Amount = " + name1.size());
        for (WebElement webElement : name1) {
            String attribute = webElement.getAttribute("id");
            assert attribute != null;
            if (attribute.equals("username")) {
                System.out.println("Day la the input");
            } else {
                System.out.println(attribute);
            }
            ;


        }
        driver.close();
    }
}
