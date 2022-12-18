package Keypress;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class keypressdemo1 {
        private WebDriver driver;
        private String baseUrl;

        @Before
        public void setUp() throws Exception {
            // System.setProperty("webdriver.gecko.driver",
            //        "/Users/atomar/Documents/workspace_personal/libs/geckodriver");
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            //driver = new FirefoxDriver();
            baseUrl = "https://letskodeit.teachable.com/p/practice";
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @Test
        public void testKeyPress() throws Exception {
            driver.get(baseUrl);
            driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/div/ul/li[2]/a")).click();
            driver.findElement(By.id("email")).sendKeys("test@email.com");
            Thread.sleep(2000);
            driver.findElement(By.id("email")).sendKeys(Keys.TAB);
            driver.findElement(By.id("password")).sendKeys("123123");
            Thread.sleep(2000);
            driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);
        }

        @After
        public void tearDown() throws Exception {
            driver.quit();
        }
    }
