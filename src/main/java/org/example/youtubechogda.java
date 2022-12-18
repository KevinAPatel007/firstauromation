package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtubechogda {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button")).click();
driver.findElement(By.name("search_query")).sendKeys("chogada tara");
//sendKeys("chogada tara");
        Thread.sleep(1000);
driver.findElement(By.id("search-icon-legacy")).click();
        Thread.sleep(1000);
//WebElement test = driver.findElement(By.className("yt-simple-endpoint"));
        driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div[2]/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3")).click();
Thread.sleep(1000);
        WebElement skipButton = driver.findElement(By.className("ytp-ad-skip-button"));
        if(skipButton.isDisplayed()) {
            if(skipButton.getText().toLowerCase() == "skip ads") {
                skipButton.click();
            }
        }
//        yt-simple-endpoint style-scope ytd-video-renderer

      //  driver.quit();
    }
}
