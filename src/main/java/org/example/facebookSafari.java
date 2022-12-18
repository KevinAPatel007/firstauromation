package org.example;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;



public class facebookSafari {
    public static void main(String[] args) throws InterruptedException {
                WebDriver driver;
                WebDriverManager.safaridriver().setup();
                driver=new SafariDriver();
                driver.manage().window().maximize();
                driver.get("https://www.facebook.com/");
                Thread.sleep(4000);
                driver.quit();
    }
}
