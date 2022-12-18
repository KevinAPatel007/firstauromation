package mousehover;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseHoveraction {
private WebDriver driver;
public   String baseUrl;
JavascriptExecutor jse;
    public static void main(String[] args) {

    }
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         baseUrl = "https://courses.letskodeit.com/practice";
        jse = (JavascriptExecutor)driver;

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    @Test()
    public void testMouseHoverActions() throws Exception {
        driver.get(baseUrl);
        jse.executeScript("window.scrollBy(0, 600)");
        Thread.sleep(2000);
        WebElement mainElement = driver.findElement(By.id("mousehover"));
        Actions action = new Actions(driver);
        action.moveToElement(mainElement).perform();
        Thread.sleep(2000);
        WebElement subElement = driver.findElement(By.xpath("//a[text()='Top']"));
        action.moveToElement(subElement).click().perform();
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
}}
