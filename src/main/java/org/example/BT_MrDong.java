package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;

public class BT_MrDong {
    public static void main(String[] args) {
        String USER_NAME = Locator.USER_NAME;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bidv.net/bidvdirectsit");
        List<String> i = new ArrayList<>();
        if( i.equals("USER_NAME"));
        System.out.println("Đây là thẻ input");

        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
    }

}
